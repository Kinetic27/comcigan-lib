/*
 * Copyright (C) 2020 PatrickKR
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 *
 * Contact me on <mailpatrickkr@gmail.com>
 */

package io.teamif.patrick.comcigan

import org.junit.Test
import kotlin.test.assertEquals

/**
 * A test class for simple [ComciganSchool]
 *
 * @author PatrickKR
 */
class ComciganAPITest {
    @Test
    fun schoolTest() {
        val name = "유성중"
        ComciganAPI.newSchool(name).run {
            println(schoolData.toString())
            assertEquals(schoolName, "유성중학교")
            assertEquals(schoolCode, "65543")
//          Sample Usage:
//            println(schoolData.THIS_WEEK.grade(1).classroom(1).MONDAY.period(1).fullSubject)
//            println(schoolData[0][0][0][0][0].fullSubject)
            refresh()
        }
    }
}