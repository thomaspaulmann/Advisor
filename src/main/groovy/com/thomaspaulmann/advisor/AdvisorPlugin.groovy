/*
 * Copyright 2016 Thomas Paul Mann
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

package com.thomaspaulmann.advisor

import org.gradle.api.Plugin
import org.gradle.api.Project

class AdvisorPlugin implements Plugin<Project> {

    /* Setup */

    def void apply(Project project) {
        // Add extension
        project.extensions.create("advisor", AdvisorExtension)

        // Add simple task
        addSimpleTask(project);
    }

    /* Simple Task */

    def private static void addSimpleTask(Project project) {
        project.task('simpleTask') {
            description = 'This is a simple task.'
            group       = 'Advisor'

            println("Simple Task was executed.")
        }
    }
}
