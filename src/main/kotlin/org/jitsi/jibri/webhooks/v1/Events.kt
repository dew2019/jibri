

/*
 * Copyright @ 2018 - present 8x8, Inc.
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

@file:Suppress("ktlint:standard:filename")

package org.jitsi.jibri.webhooks.v1

import org.jitsi.jibri.status.JibriSessionStatus
import org.jitsi.jibri.status.JibriStatus

sealed class JibriEvent(val jibriId: String) {
    class HealthEvent(jibriId: String, val status: JibriStatus) : JibriEvent(jibriId)
    class SessionEvent(jibriId: String, val session: JibriSessionStatus) : JibriEvent(jibriId)
}
