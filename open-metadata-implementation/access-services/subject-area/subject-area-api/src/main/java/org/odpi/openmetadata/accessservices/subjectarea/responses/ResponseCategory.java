/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.accessservices.subjectarea.responses;

/**
 * Types of response
 */
public enum ResponseCategory {
    Unknown,
    // valid rest
    Void,
    PossibleClassifications,
    PossibleRelationships,
    Term,
    Category,
    SubjectAreaDefinition,
    Glossary,
    Project,
    Comment,

    // term to term relationship
    TermHASARelationship,
    RelatedTerm,
    SynonymRelationship,
    AntonymRelationship,
    TranslationRelationship,
    TermISARelationship,
    PreferredTermRelationship,
    TermISATYPEOFRelationship,
    TermReplacementRelationship,
    TermTYPEDBYRelationship,
    TermUsedInContextRelationship,
    ValidValueRelationship,
    // term relationships
    TermRelationships,
    // external glossary relationships
    LibraryCategoryReferenceRelationshipRelationship,
    LibraryTermReferenceRelationshipRelationship,
    // term to asset
    SemanticAssignmentRelationship,
    // category to term
    TermCategorizationRelationship,
    // category relationships
    CategoryRelationships,

    // errors
    ClassificationException,
    EntityNotDeletedException,
    FunctionNotSupportedException,
    GUIDNotDeletedException,
    GUIDNotPurgedException,
    InvalidParameterException,
    RelationshipNotDeletedException,
    StatusNotSupportedException,
    SubjectAreaRuntimeException,
    UnrecognizedGUIDException,
    UnrecognizedNameException,
    UserNotAuthorizedException,
    MetadataServerUncontactableException



}
