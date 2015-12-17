/* CVS $Id: $ */
package com.genohm.boinq.generated.vocabularies; 
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;
 
/**
 * Vocabulary definitions from file:/Users/martijn/Documents/workspace-sts-3.7.0.RELEASE/boinq/ontologies/faldo.ttl 
 * @author Auto-generated by schemagen on 17 Dec 2015 23:23 
 */
public class FaldoVocab {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://biohackathon.org/resource/faldo#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "Created at the Biohackathon 2012 and 2013";
    
    /** <p>This predicate is used when you want to describe a non-inclusive range. Only 
     *  used in the InBetweenPosition to say it is after a nucleotide, but before 
     *  the next one.</p>
     */
    public static final ObjectProperty after = m_model.createObjectProperty( "http://biohackathon.org/resource/faldo#after" );
    
    /** <p>This predicate is used to indicate that the feature is found before the exact 
     *  position. Use to indicate, for example, a cleavage site. The cleavage happens 
     *  between two amino acids before one and after the other.</p>
     */
    public static final ObjectProperty before = m_model.createObjectProperty( "http://biohackathon.org/resource/faldo#before" );
    
    /** <p>The inclusive beginning of a position. Also known as start.</p> */
    public static final ObjectProperty begin = m_model.createObjectProperty( "http://biohackathon.org/resource/faldo#begin" );
    
    public static final ObjectProperty beginOf = m_model.createObjectProperty( "http://biohackathon.org/resource/faldo#beginOf" );
    
    /** <p>The inclusive end of the position.</p> */
    public static final ObjectProperty end = m_model.createObjectProperty( "http://biohackathon.org/resource/faldo#end" );
    
    public static final ObjectProperty endOf = m_model.createObjectProperty( "http://biohackathon.org/resource/faldo#endOf" );
    
    /** <p>This is the link between the concept whose location you are annotating and 
     *  its range or position. For example, when annotating the region that describes 
     *  an exon, the exon would be the subject and the region would be the object 
     *  of the triple or: 'active site' 'location' [is] 'position 3'.</p>
     */
    public static final ObjectProperty location = m_model.createObjectProperty( "http://biohackathon.org/resource/faldo#location" );
    
    /** <p>The reference is the resource that the position value is anchored to. For 
     *  example, a contig or chromosome in a genome assembly.</p>
     */
    public static final ObjectProperty reference = m_model.createObjectProperty( "http://biohackathon.org/resource/faldo#reference" );
    
    /** <p>The position value is the offset along the reference where this position is 
     *  found. Thus the only the position value in combination with the reference 
     *  determines where a position is.Denoted in 1-based closed coordinates, i.e. 
     *  the position on the first amino acid or nucleotide of a sequence has the value 
     *  1. For nucleotide sequences we count from the 5'end of the sequence, while 
     *  for Aminoacid sequences we start counting from the N-Terminus.</p>
     */
    public static final DatatypeProperty position = m_model.createDatatypeProperty( "http://biohackathon.org/resource/faldo#position" );
    
    /** <p>Used to describe a location that consists of a number of Regions but where 
     *  the order is not known. e.g. the oddly named order() keyword in a INSDC file.</p>
     */
    public static final OntClass BagOfRegions = m_model.createClass( "http://biohackathon.org/resource/faldo#BagOfRegions" );
    
    /** <p>The 'both strands position' indicates a region that is best described as being 
     *  on 'both' strands of a double-stranded sequence, rather than one or the other.</p>
     */
    public static final OntClass BothStrandsPosition = m_model.createClass( "http://biohackathon.org/resource/faldo#BothStrandsPosition" );
    
    /** <p>The C-terminus is the end of an amino acid chain (protein or polypeptide), 
     *  terminated by a free carboxyl group (-COOH).</p>
     */
    public static final OntClass C_TerminalPosition = m_model.createClass( "http://biohackathon.org/resource/faldo#C-TerminalPosition" );
    
    /** <p>Sometimes a location of a feature is defined by a collection of regions e.g. 
     *  join() and order() in INSDC records. One should always try to model the semantics 
     *  more accurately than this, these are fallback options to encode legacy data.</p>
     */
    public static final OntClass CollectionOfRegions = m_model.createClass( "http://biohackathon.org/resource/faldo#CollectionOfRegions" );
    
    /** <p>A position that is exactly known.</p> */
    public static final OntClass ExactPosition = m_model.createClass( "http://biohackathon.org/resource/faldo#ExactPosition" );
    
    /** <p>The position is on the forward (positive, 5' to 3') strand. Shown as a '+' 
     *  in GFF3 and GTF.</p>
     */
    public static final OntClass ForwardStrandPosition = m_model.createClass( "http://biohackathon.org/resource/faldo#ForwardStrandPosition" );
    
    /** <p>A position that lacks exact data.</p> */
    public static final OntClass FuzzyPosition = m_model.createClass( "http://biohackathon.org/resource/faldo#FuzzyPosition" );
    
    /** <p>This indicates that a feature is between two other positions that are both 
     *  known exactly and that are next to each other. An example is a restriction 
     *  enzyme cutting site. The cut is after one position and before the other position 
     *  (hence, in between).</p>
     */
    public static final OntClass InBetweenPosition = m_model.createClass( "http://biohackathon.org/resource/faldo#InBetweenPosition" );
    
    /** <p>Use when you have an idea of the range in which you can find the position, 
     *  but you cannot be sure about the exact position.</p>
     */
    public static final OntClass InRangePosition = m_model.createClass( "http://biohackathon.org/resource/faldo#InRangePosition" );
    
    /** <p>Should be used when the location of a region is defined by an ordered list 
     *  of Regions. However, try to avoid using these types in favor of using more 
     *  explicit semantics about why the order is important.As an ordered list of 
     *  regions (but the list might not be complete).</p>
     */
    public static final OntClass ListOfRegions = m_model.createClass( "http://biohackathon.org/resource/faldo#ListOfRegions" );
    
    /** <p>The position of the starting amino-acid a protein or polypeptide terminated 
     *  by an amino acid with a free amine group (-NH2). The convention for writing 
     *  peptide sequences is to put the N-terminus on the left and write the sequence 
     *  from N- to C-terminus. Instances of this class are often used when the reference 
     *  sequence is not complete</p>
     */
    public static final OntClass N_TerminalPosition = m_model.createClass( "http://biohackathon.org/resource/faldo#N-TerminalPosition" );
    
    /** <p>The position is known to be one of the more detailed positions listed by the 
     *  location predicate.</p>
     */
    public static final OntClass OneOfPosition = m_model.createClass( "http://biohackathon.org/resource/faldo#OneOfPosition" );
    
    /** <p>Superclass for the general concept of a position on a sequence. The sequence 
     *  is designated with the reference predicate.</p>
     */
    public static final OntClass Position = m_model.createClass( "http://biohackathon.org/resource/faldo#Position" );
    
    /** <p>A region describes a length of sequence with a start position and end position 
     *  that represents a feature on a sequence, e.g. a gene.</p>
     */
    public static final OntClass Region = m_model.createClass( "http://biohackathon.org/resource/faldo#Region" );
    
    /** <p>The position is on the reverse (complement, 3' to 5') strand of the sequence. 
     *  Shown as '-' in GTF and GFF3.</p>
     */
    public static final OntClass ReverseStrandPosition = m_model.createClass( "http://biohackathon.org/resource/faldo#ReverseStrandPosition" );
    
    /** <p>Part of the coordinate system denoting on which strand the feature can be 
     *  found. If you do not yet know which stand the feature is on, you should tag 
     *  the position with just this class. If you know more you should use one of 
     *  the subclasses. This means a region described with a '.' in GFF3. A GFF3 unstranded 
     *  position does not have this type in FALDO -- those are just a 'position'.</p>
     */
    public static final OntClass StrandedPosition = m_model.createClass( "http://biohackathon.org/resource/faldo#StrandedPosition" );
    
// INDIVIDUALS
}
