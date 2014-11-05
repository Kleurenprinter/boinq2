boinqApp.constant('DatasourceConstants', {
	TYPE_LOCAL_FALDO : 0,
	TYPE_REMOTE_FALDO : 1,
	TYPE_LOCAL_SPARQL : 2,
	TYPE_REMOTE_SPARQL : 3,


	TYPE_ITEMS : {
		'0' : 'Local Faldo endpoint',
		'1' : 'Remote Faldo endpoint',
		'2' : 'Local generic SPARQL',
		'3' : 'Remote generic SPARQL'
	},
	
	STATUS_EMPTY : 0,
	STATUS_RAW_DATA : 1,
	
	STATUS_ITEMS : {
  		'0': "Empty",
  		'1': "Contains raw data"
	}
	

});

boinqApp.constant('DataFileConstants', {
	
	STATUS_LOADING : 0,
	STATUS_COMPLETE : 1,
	STATUS_ERROR : 2,
	
	STATUS_ITEMS : {
  		'0': "Loading into endpoint",
  		'1': "Complete",
  		'2': "Error"
	}

});

boinqApp.constant('SPARQLConstants',{
	
	DEFAULT_PREFIXES : ["PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>",
	                    "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>"].join('\n'),
	                    
	QUERY_GET_ROOT_TERMS : ["SELECT ?uri ?label WHERE {",
	                        "  ?uri rdfs:label ?label.",
	                        "  OPTIONAL{?uri rdfs:subClassOf ?super}",
	                        "  FILTER(!bound(?super))","}"].join('\n')
});