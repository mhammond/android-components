/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package mozilla.components.feature.media.ext

import mozilla.components.browser.state.state.MediaState
import mozilla.components.concept.engine.media.Media
/**
 * Pauses all [Media] in this list.
 */
internal fun List<MediaState.Element>.pause() {
    forEach { it.controller.pause() }
}

/**
 * Plays all [Media] in this list.
 */
internal fun List<MediaState.Element>.play() {
    forEach { it.controller.play() }
}
