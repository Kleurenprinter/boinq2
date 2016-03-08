/* CVS $Id: $ */
package com.genohm.boinq.generated.vocabularies; 
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;
 
/**
 * Vocabulary definitions from file:C:\Users\Jim\Desktop\workspace\boinq\ontologies/track.owl 
 * @author Auto-generated by schemagen on 16 Feb 2016 16:19 
 */
public class TrackVocab {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.boinq.org/iri/ontologies/track#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final ObjectProperty endpoint = m_model.createObjectProperty( "http://www.boinq.org/iri/ontologies/track#endpoint" );
    
    public static final ObjectProperty entry = m_model.createObjectProperty( "http://www.boinq.org/iri/ontologies/track#entry" );
    
    public static final ObjectProperty holds = m_model.createObjectProperty( "http://www.boinq.org/iri/ontologies/track#holds" );
    
    public static final ObjectProperty originalReference = m_model.createObjectProperty( "http://www.boinq.org/iri/ontologies/track#originalReference" );
    
    public static final ObjectProperty partOf = m_model.createObjectProperty( "http://www.boinq.org/iri/ontologies/track#partOf" );
    
    public static final ObjectProperty provides = m_model.createObjectProperty( "http://www.boinq.org/iri/ontologies/track#provides" );
    
    public static final ObjectProperty references = m_model.createObjectProperty( "http://www.boinq.org/iri/ontologies/track#references" );
    
    public static final ObjectProperty supports = m_model.createObjectProperty( "http://www.boinq.org/iri/ontologies/track#supports" );
    
    public static final ObjectProperty targetReference = m_model.createObjectProperty( "http://www.boinq.org/iri/ontologies/track#targetReference" );
    
    public static final ObjectProperty targets = m_model.createObjectProperty( "http://www.boinq.org/iri/ontologies/track#targets" );
    
    public static final DatatypeProperty bedHeader = m_model.createDatatypeProperty( "http://www.boinq.org/iri/ontologies/track#bedHeader" );
    
    public static final DatatypeProperty endpointUrl = m_model.createDatatypeProperty( "http://www.boinq.org/iri/ontologies/track#endpointUrl" );
    
    public static final DatatypeProperty fileExtension = m_model.createDatatypeProperty( "http://www.boinq.org/iri/ontologies/track#fileExtension" );
    
    public static final DatatypeProperty fileName = m_model.createDatatypeProperty( "http://www.boinq.org/iri/ontologies/track#fileName" );
    
    public static final DatatypeProperty gffHeader = m_model.createDatatypeProperty( "http://www.boinq.org/iri/ontologies/track#gffHeader" );
    
    public static final DatatypeProperty graphUri = m_model.createDatatypeProperty( "http://www.boinq.org/iri/ontologies/track#graphUri" );
    
    public static final DatatypeProperty motherTerm = m_model.createDatatypeProperty( "http://www.boinq.org/iri/ontologies/track#motherTerm" );
    
    public static final DatatypeProperty tripleCount = m_model.createDatatypeProperty( "http://www.boinq.org/iri/ontologies/track#tripleCount" );
    
    public static final DatatypeProperty vcfHeaderFilter = m_model.createDatatypeProperty( "http://www.boinq.org/iri/ontologies/track#vcfHeaderFilter" );
    
    public static final DatatypeProperty vcfHeaderFormat = m_model.createDatatypeProperty( "http://www.boinq.org/iri/ontologies/track#vcfHeaderFormat" );
    
    public static final DatatypeProperty vcfHeaderInfo = m_model.createDatatypeProperty( "http://www.boinq.org/iri/ontologies/track#vcfHeaderInfo" );
    
    public static final DatatypeProperty vcfHeaderMetadata = m_model.createDatatypeProperty( "http://www.boinq.org/iri/ontologies/track#vcfHeaderMetadata" );
    
    /** <p>A Datasource is a source of information. It is usually a SPARQL Endpoint</p> */
    public static final OntClass Datasource = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#Datasource" );
    
    /** <p>A FaldoDatasource that uses FALDO for referencing an assembly</p> */
    public static final OntClass FaldoDatasource = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#FaldoDatasource" );
    
    public static final OntClass FaldoTrack = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#FaldoTrack" );
    
    /** <p>A SPARQLDatasource offering features.</p> */
    public static final OntClass FeatureDatasource = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#FeatureDatasource" );
    
    public static final OntClass FeatureType = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#FeatureType" );
    
    public static final OntClass FeatureTypeFilter = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#FeatureTypeFilter" );
    
    /** <p>A field. An attribute of a feature that can be used to filter on.</p> */
    public static final OntClass Field = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#Field" );
    
    public static final OntClass LocationFilter = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#LocationFilter" );
    
    public static final OntClass Match = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#Match" );
    
    public static final OntClass MatchField = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#MatchField" );
    
    /** <p>Match a numeric value</p> */
    public static final OntClass MatchNumber = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#MatchNumber" );
    
    /** <p>Match a string value</p> */
    public static final OntClass MatchString = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#MatchString" );
    
    /** <p>match a term from a target graph</p> */
    public static final OntClass MatchTerm = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#MatchTerm" );
    
    public static final OntClass Operator = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#Operator" );
    
    /** <p>A representation of a reference sequence (e.g. a chromosome) supported by 
     *  the viewer</p>
     */
    public static final OntClass Reference = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#Reference" );
    
    /** <p>A referenceAssembly supported by the viewer</p> */
    public static final OntClass ReferenceAssembly = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#ReferenceAssembly" );
    
    /** <p>An entry for mapping the datasources reference sequence IRI to a reference 
     *  known by the viewer</p>
     */
    public static final OntClass ReferenceMapEntry = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#ReferenceMapEntry" );
    
    /** <p>A Datasource that you can query using a SPARQL Endpoint</p> */
    public static final OntClass SPARQLDatasource = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#SPARQLDatasource" );
    
    /** <p>A SPARQL Datasource offering terms</p> */
    public static final OntClass TermDatasource = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#TermDatasource" );
    
    /** <p>A collection of features of the same type</p> */
    public static final OntClass Track = m_model.createClass( "http://www.boinq.org/iri/ontologies/track#Track" );
    
// INDIVIDUALS
    public static final Individual GRCh37 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37", ReferenceAssembly );
    
    public static final Individual GRCh37chr01 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr01", Reference );
    
    public static final Individual GRCh37chr02 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr02", Reference );
    
    public static final Individual GRCh37chr03 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr03", Reference );
    
    public static final Individual GRCh37chr04 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr04", Reference );
    
    public static final Individual GRCh37chr05 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr05", Reference );
    
    public static final Individual GRCh37chr06 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr06", Reference );
    
    public static final Individual GRCh37chr07 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr07", Reference );
    
    public static final Individual GRCh37chr08 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr08", Reference );
    
    public static final Individual GRCh37chr09 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr09", Reference );
    
    public static final Individual GRCh37chr10 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr10", Reference );
    
    public static final Individual GRCh37chr11 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr11", Reference );
    
    public static final Individual GRCh37chr12 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr12", Reference );
    
    public static final Individual GRCh37chr13 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr13", Reference );
    
    public static final Individual GRCh37chr14 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr14", Reference );
    
    public static final Individual GRCh37chr15 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr15", Reference );
    
    public static final Individual GRCh37chr16 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr16", Reference );
    
    public static final Individual GRCh37chr17 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr17", Reference );
    
    public static final Individual GRCh37chr18 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr18", Reference );
    
    public static final Individual GRCh37chr19 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr19", Reference );
    
    public static final Individual GRCh37chr20 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr20", Reference );
    
    public static final Individual GRCh37chr21 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr21", Reference );
    
    public static final Individual GRCh37chr22 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chr22", Reference );
    
    public static final Individual GRCh37chrX = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chrX", Reference );
    
    public static final Individual GRCh37chrY = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh37chrY", Reference );
    
    public static final Individual GRCh38 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38", ReferenceAssembly );
    
    public static final Individual GRCh38chr01 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr01", Reference );
    
    public static final Individual GRCh38chr02 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr02", Reference );
    
    public static final Individual GRCh38chr03 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr03", Reference );
    
    public static final Individual GRCh38chr04 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr04", Reference );
    
    public static final Individual GRCh38chr05 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr05", Reference );
    
    public static final Individual GRCh38chr06 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr06", Reference );
    
    public static final Individual GRCh38chr07 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr07", Reference );
    
    public static final Individual GRCh38chr08 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr08", Reference );
    
    public static final Individual GRCh38chr09 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr09", Reference );
    
    public static final Individual GRCh38chr10 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr10", Reference );
    
    public static final Individual GRCh38chr11 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr11", Reference );
    
    public static final Individual GRCh38chr12 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr12", Reference );
    
    public static final Individual GRCh38chr13 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr13", Reference );
    
    public static final Individual GRCh38chr14 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr14", Reference );
    
    public static final Individual GRCh38chr15 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr15", Reference );
    
    public static final Individual GRCh38chr16 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr16", Reference );
    
    public static final Individual GRCh38chr17 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr17", Reference );
    
    public static final Individual GRCh38chr18 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr18", Reference );
    
    public static final Individual GRCh38chr19 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr19", Reference );
    
    public static final Individual GRCh38chr20 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr20", Reference );
    
    public static final Individual GRCh38chr21 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr21", Reference );
    
    public static final Individual GRCh38chr22 = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chr22", Reference );
    
    public static final Individual GRCh38chrX = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chrX", Reference );
    
    public static final Individual GRCh38chrY = m_model.createIndividual( "http://www.boinq.org/iri/ontologies/track#GRCh38chrY", Reference );
    
}
