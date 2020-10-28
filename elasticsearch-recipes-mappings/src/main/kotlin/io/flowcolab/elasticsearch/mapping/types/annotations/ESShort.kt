package io.flowcolab.elasticsearch.mapping.types.annotations

import io.flowcolab.elasticsearch.mapping.types.ESTypeName
import io.flowcolab.elasticsearch.mapping.types.properties.ESShortProperties
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
@ESType(ESTypeName.SHORT)
@MustBeDocumented
annotation class ESShort(val properties: KClass<ESShortProperties>)