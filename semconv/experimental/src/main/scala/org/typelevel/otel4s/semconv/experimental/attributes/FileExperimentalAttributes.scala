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
object FileExperimentalAttributes {

  /** Directory where the file is located. It should include the drive letter, when appropriate.
    */
  val FileDirectory: AttributeKey[String] =
    AttributeKey("file.directory")

  /** File extension, excluding the leading dot. <p>
    * @note
    *   <p> When the file name has multiple extensions (example.tar.gz), only the last one should be captured ("gz", not
    *   "tar.gz").
    */
  val FileExtension: AttributeKey[String] =
    AttributeKey("file.extension")

  /** Name of the file including the extension, without the directory.
    */
  val FileName: AttributeKey[String] =
    AttributeKey("file.name")

  /** Full path to the file, including the file name. It should include the drive letter, when appropriate.
    */
  val FilePath: AttributeKey[String] =
    AttributeKey("file.path")

  /** File size in bytes.
    */
  val FileSize: AttributeKey[Long] =
    AttributeKey("file.size")

}
