/*******************************************************************************
 * Copyright 2015 IBM Corporation
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
 *******************************************************************************/
package com.ibm.watson.catalyst.jumpqa.template;

import org.apache.commons.csv.CSVRecord;

/**
 * An interface for reading a template from a CSVRecord.
 * 
 * @author Will Beason
 * @version 0.1.1
 * @since 0.1.0
 *
 */
public interface ITemplateRecordReader {
  
  /**
   * Reads a template from a CSVRecord.
   * 
   * @param aRecord the CSVRecord to convert to a template
   * @return a new template with the options specified in the CSVRecord
   */
  public ITemplate readRecord(CSVRecord aRecord);
  
}
