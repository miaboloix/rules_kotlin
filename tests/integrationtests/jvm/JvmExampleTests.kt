/*
 * Copyright 2018 The Bazel Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.bazel.kotlin.testing.jvm

import io.bazel.kotlin.testing.BasicAssertionTestCase
import org.junit.Test

/**
 * These tests verify properties of the example.
 */
class JvmExampleTests: BasicAssertionTestCase() {
    @Test
    fun daggerExampleIsRunnable() {
        assertExecutableRunfileSucceeds("//examples/dagger/coffee_app",
            description = "the dagger coffee_app should execute succesfully")
    }
}