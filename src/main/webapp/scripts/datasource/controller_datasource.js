'use strict';

boinqApp.controller('DatasourceController', ['$scope', 'resolvedDatasource', 'Datasource', 'DatasourceDatafile', 'DatasourceConversion', 'FileUploader', 'DatasourceConstants', 
    function ($scope, resolvedDatasource, Datasource, DatasourceDatafile,  DatasourceConversion, FileUploader, DatasourceConstants) {

	
		$scope.typeItems = DatasourceConstants.TYPE_ITEMS;
		
        $scope.datasources = resolvedDatasource;

        $scope.create = function () {
            Datasource.save($scope.datasource,
                function () {
                    $scope.datasources = Datasource.query();
                    $('#saveDatasourceModal').modal('hide');
                    $scope.clear();
                });
        };

        $scope.update = function (id) {
            $scope.datasource = Datasource.get({id: id});
            $('#saveDatasourceModal').modal('show');
        };

        $scope.delete = function (id) {
            Datasource.delete({id: id},
                function () {
                    $scope.datasources = Datasource.query();
                });
        };

        $scope.clear = function () {
            $scope.datasource = {id: null, endpointUrl: null, type: null};
        };
        
        // management
        
        $scope.manageddatasource = null;
        
        $scope.canupload = function(datasource) {
        	return $scope.manageddatasource != null && $scope.manageddatasource.type == DatasourceConstants.TYPE_LOCAL_FALDO;
        }
        $scope.manage= function(datasource) {
        	$scope.manageddatasource = datasource;
        	$('#manageDatasourceModal').modal('show');
        }
        $scope.canmanage = function(datasource) {
        	return datasource.type == DatasourceConstants.TYPE_LOCAL_FALDO;
        }
        $scope.isLocal = function(datasource) {
        	return datasource.type == DatasourceConstants.TYPE_LOCAL_FALDO;
        }
        $scope.removefile = function(rawdatafile_id) {
        	var ds_id = $scope.manageddatasource.id;
        	DatasourceDatafile.remove({id:ds_id, data_id:rawdatafile_id},
        			function () {
        				$scope.datasources = Datasource.query();
        				$scope.manageddatasource = Datasource.get({id:ds_id});
        	});
        }
        $scope.startconversion = function(rawdatafile_id) {
        	var ds_id = $scope.manageddatasource.id;
        	DatasourceConversion.start({id:ds_id}, rawdatafile_id);
        }
        
        // file uploader stuff
        
        var uploader = $scope.uploader = new FileUploader({
            url: 'upload',
            removeAfterUpload: true
        });

        // FILTERS

        uploader.filters.push({
            name: 'customFilter',
            fn: function(item /*{File|FileLikeObject}*/, options) {
                return this.queue.length < 10;
            }
        });

        // CALLBACKS

        uploader.onWhenAddingFileFailed = function(item /*{File|FileLikeObject}*/, filter, options) {
            console.info('onWhenAddingFileFailed', item, filter, options);
        };
        uploader.onAfterAddingFile = function(fileItem) {
            console.info('onAfterAddingFile', fileItem);
        };
        uploader.onAfterAddingAll = function(addedFileItems) {
            console.info('onAfterAddingAll', addedFileItems);
        };
        uploader.onBeforeUploadItem = function(item) {
        	var filename = item.file.name;
        	var dsurl = 'rest/datasources/' + $scope.manageddatasource.id + '/upload';
        	item.formData.push({name: filename});
        	item.url = dsurl;
            console.info('onBeforeUploadItem', item);
        };
        uploader.onProgressItem = function(fileItem, progress) {
            console.info('onProgressItem', fileItem, progress);
        };
        uploader.onProgressAll = function(progress) {
            console.info('onProgressAll', progress);
        };
        uploader.onSuccessItem = function(fileItem, response, status, headers) {
	        	//remove fileItem from queue
        	$scope.manageddatasource = Datasource.get({id: $scope.manageddatasource.id});
        	console.info('onSuccessItem', $scope.manageddatasource );
            console.info('onSuccessItem', fileItem, response, status, headers);
        };
        uploader.onErrorItem = function(fileItem, response, status, headers) {
            console.info('onErrorItem', fileItem, response, status, headers);
        };
        uploader.onCancelItem = function(fileItem, response, status, headers) {
            console.info('onCancelItem', fileItem, response, status, headers);
        };
        uploader.onCompleteItem = function(fileItem, response, status, headers) {
            console.info('onCompleteItem', fileItem, response, status, headers);
        };
        uploader.onCompleteAll = function() {
            console.info('onCompleteAll');
        };

        console.info('Loaded controller_datasources', DatasourceConstants.TYPE_ITEMS);
        
    }]);
