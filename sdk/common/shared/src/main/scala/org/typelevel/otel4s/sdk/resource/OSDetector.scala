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

package org.typelevel.otel4s.sdk.resource

import org.typelevel.otel4s.AttributeKey

/** Detects OS type and description.
  *
  * @see
  *   https://opentelemetry.io/docs/specs/semconv/resource/os/
  */
object OSDetector extends OSDetectorPlatform {

  private[sdk] object Const {
    val Name = "os"
  }

  private[resource] object Keys {
    val Type: AttributeKey[String] =
      AttributeKey[String]("os.type")

    val Description: AttributeKey[String] =
      AttributeKey[String]("os.description")
  }

}
