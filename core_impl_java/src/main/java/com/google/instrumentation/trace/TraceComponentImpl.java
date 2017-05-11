/*
 * Copyright 2017, Google Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.instrumentation.trace;

import com.google.instrumentation.common.DisruptorEventQueue;
import com.google.instrumentation.internal.MillisClock;

/** Java 7 and 8 implementation of the {@link TraceComponent}. */
public final class TraceComponentImpl extends TraceComponentImplBase {

  /** Public constructor to be used with reflection loading. */
  public TraceComponentImpl() {
    super(
        MillisClock.getInstance(),
        new ThreadLocalRandomHandler(),
        DisruptorEventQueue.getInstance());
  }
}