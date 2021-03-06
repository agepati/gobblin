/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.gobblin.data.management.copy;

import org.apache.gobblin.dataset.Dataset;
import org.apache.gobblin.dataset.DatasetDescriptor;


/**
 * A common superinterface for {@link Dataset}s that can be operated on by distcp.
 * Concrete classes must implement a subinterface of this interface ({@link CopyableDataset} or {@link IterableCopyableDataset}).
 */
public interface CopyableDatasetBase extends Dataset {
  /**
   * Get the descriptor which identifies and provides metadata of the dataset
   */
  default DatasetDescriptor getDatasetDescriptor() {
    return null;
  }
}
