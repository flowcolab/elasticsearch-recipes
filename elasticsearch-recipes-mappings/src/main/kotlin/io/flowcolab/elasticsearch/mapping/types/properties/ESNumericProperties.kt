package io.flowcolab.elasticsearch.mapping.types.properties

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
data class ESNumericProperties(
    /**
     * Whether to transform strings to number and truncate fractions for integers.
     */
    @JsonProperty("coerce")
    val coerce: Boolean? = null,

    /**
     * Field boosting.
     */
    @JsonProperty("boost")
    val boost: Float? = null,

    /**
     * Whether to keep value on disk in order to be used for sorting, aggregations or scripting.
     */
    @JsonProperty("doc_values")
    val docValues: Boolean? = null,

    /**
     * Whether malformed values should be ignored or an exception be thrown.
     */
    @JsonProperty("ignore_malformed")
    val ignoreMalformed: Boolean? = null,

    /**
     * Whether the field should be indexed for searching.
     */
    @JsonProperty("index")
    val index: Boolean? = null,

    /**
     * Specify the value of the same field type that will be handled as null, in case null cannot be used.
     */
    @JsonProperty("null_value")
    val nullValue: Any? = null,

    /**
     * Whether the field should be stored and retrieved separately than the source.
     */
    @JsonProperty("store")
    val store: Boolean? = null,

    /**
     * Metadata about the field.
     */
    @JsonProperty("meta")
    val meta: Any? = null
)