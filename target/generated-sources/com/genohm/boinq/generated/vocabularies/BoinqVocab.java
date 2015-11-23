/* CVS $Id: $ */
package com.genohm.boinq.generated.vocabularies; 
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;
 
/**
 * Vocabulary definitions from file:/Users/martijn/Documents/workspace-sts-3.7.0.RELEASE/boinq/ontologies/boinq.owl 
 * @author Auto-generated by schemagen on 18 Nov 2015 15:59 
 */
public class BoinqVocab {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.boinq.org/iri/onthologies/custom#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final OntClass Allele_Balance = m_model.createClass( "http://www.boinq.org/iri/onthologies/custom#Allele_Balance" );
    
    /** <p>AD numbers are the total number of reads with each allele</p> */
    public static final OntClass Allelic_Depth = m_model.createClass( "http://www.boinq.org/iri/onthologies/custom#Allelic_Depth" );
    
    public static final OntClass Allelic_Depth_Alternate = m_model.createClass( "http://www.boinq.org/iri/onthologies/custom#Allelic_Depth_Alternate" );
    
    public static final OntClass Allelic_Depth_Reference = m_model.createClass( "http://www.boinq.org/iri/onthologies/custom#Allelic_Depth_Reference" );
    
    public static final OntClass Base_Quality_Rank_Sum = m_model.createClass( "http://www.boinq.org/iri/onthologies/custom#Base_Quality_Rank_Sum" );
    
    public static final OntClass Clipping_Rank_Sum = m_model.createClass( "http://www.boinq.org/iri/onthologies/custom#Clipping_Rank_Sum" );
    
    public static final OntClass Fisher_Strand = m_model.createClass( "http://www.boinq.org/iri/onthologies/custom#Fisher_Strand" );
    
    public static final OntClass Mapping_Quality_Rank_Sum = m_model.createClass( "http://www.boinq.org/iri/onthologies/custom#Mapping_Quality_Rank_Sum" );
    
    public static final OntClass Maximum_Likelihood_Expectation_Allele_Count = m_model.createClass( "http://www.boinq.org/iri/onthologies/custom#Maximum_Likelihood_Expectation_Allele_Count" );
    
    public static final OntClass Maximum_Likelihood_Expectation_Allele_Frequency = m_model.createClass( "http://www.boinq.org/iri/onthologies/custom#Maximum_Likelihood_Expectation_Allele_Frequency" );
    
    public static final OntClass Object = m_model.createClass( "http://www.boinq.org/iri/onthologies/custom#Object" );
    
    public static final OntClass Quality_By_Depth = m_model.createClass( "http://www.boinq.org/iri/onthologies/custom#Quality_By_Depth" );
    
    public static final OntClass Quantity = m_model.createClass( "http://www.boinq.org/iri/onthologies/custom#Quantity" );
    
    public static final OntClass Read_Position_Rank_Sum = m_model.createClass( "http://www.boinq.org/iri/onthologies/custom#Read_Position_Rank_Sum" );
    
    public static final OntClass Score = m_model.createClass( "http://www.boinq.org/iri/onthologies/custom#Score" );
    
// INDIVIDUALS
}
