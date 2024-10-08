/*
 * Copyright 2023 Typelevel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.typelevel.otel4s
package semconv
package experimental.attributes

// DO NOT EDIT, this is an Auto-generated file from buildscripts/templates/registry/otel4s/attributes/SemanticAttributes.scala.j2
object ExceptionExperimentalAttributes {

  /** SHOULD be set to true if the exception event is recorded at a point where it is known that the exception is
    * escaping the scope of the span. <p>
    * @note
    *   <p> An exception is considered to have escaped (or left) the scope of a span, if that span is ended while the
    *   exception is still logically "in flight". This may be actually "in flight" in some languages (e.g. if the
    *   exception is passed to a Context manager's `__exit__` method in Python) but will usually be caught at the point
    *   of recording the exception in most languages. <p> It is usually not possible to determine at the point where an
    *   exception is thrown whether it will escape the scope of a span. However, it is trivial to know that an exception
    *   will escape, if one checks for an active exception just before ending the span, as done in the <a
    *   href="https://opentelemetry.io/docs/specs/semconv/exceptions/exceptions-spans/#recording-an-exception">example
    *   for recording span exceptions</a>. <p> It follows that an exception may still escape the scope of the span even
    *   if the `exception.escaped` attribute was not set or set to false, since the event might have been recorded at a
    *   time where it was not clear whether the exception will escape.
    */
  @deprecated(
    "use `org.typelevel.otel4s.semconv.attributes.ExceptionAttributes.ExceptionEscaped` instead.",
    ""
  )
  val ExceptionEscaped: AttributeKey[Boolean] =
    AttributeKey("exception.escaped")

  /** The exception message.
    */
  @deprecated(
    "use `org.typelevel.otel4s.semconv.attributes.ExceptionAttributes.ExceptionMessage` instead.",
    ""
  )
  val ExceptionMessage: AttributeKey[String] =
    AttributeKey("exception.message")

  /** A stacktrace as a string in the natural representation for the language runtime. The representation is to be
    * determined and documented by each language SIG.
    */
  @deprecated(
    "use `org.typelevel.otel4s.semconv.attributes.ExceptionAttributes.ExceptionStacktrace` instead.",
    ""
  )
  val ExceptionStacktrace: AttributeKey[String] =
    AttributeKey("exception.stacktrace")

  /** The type of the exception (its fully-qualified class name, if applicable). The dynamic type of the exception
    * should be preferred over the static type in languages that support it.
    */
  @deprecated(
    "use `org.typelevel.otel4s.semconv.attributes.ExceptionAttributes.ExceptionType` instead.",
    ""
  )
  val ExceptionType: AttributeKey[String] =
    AttributeKey("exception.type")

}
