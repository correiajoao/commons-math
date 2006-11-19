// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
// 
//   http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.spaceroots.mantissa.ode;

import org.spaceroots.mantissa.MantissaException;

/**
 * This exception is made available to users to report
 * the error conditions that are trigegred while computing
 * the differential equations.
 * @author Luc Maisonobe
 * @version $Id: DerivativeException.java 1705 2006-09-17 19:57:39Z luc $
 */
public class DerivativeException
  extends MantissaException {
    
  /** Simple constructor.
   * Build an exception by translating and formating a message
   * @param specifier format specifier (to be translated)
   * @param parts to insert in the format (no translation)
   */
  public DerivativeException(String specifier, String[] parts) {
    super(specifier, parts);
  }

  /** Build an instance from an underlying cause.
   * @param cause cause for the exception
   */
  public DerivativeException(Throwable cause) {
    super(cause);
  }

  private static final long serialVersionUID = -4100440615830558122L;

}
