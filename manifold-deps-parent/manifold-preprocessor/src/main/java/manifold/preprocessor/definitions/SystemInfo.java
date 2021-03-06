/*
 * Copyright (c) 2019 - Manifold Systems LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package manifold.preprocessor.definitions;

import java.util.Locale;

public class SystemInfo
{
  public static final String OS_NAME = System.getProperty( "os.name" );
  public static final String OS_VERSION = System.getProperty( "os.version" ).toLowerCase( Locale.US );

  private static final String _OS_NAME = OS_NAME.toLowerCase( Locale.US );
  public static final boolean isWindows = _OS_NAME.startsWith( "windows" );
  public static final boolean isMac = _OS_NAME.startsWith( "mac" );
  public static final boolean isLinux = _OS_NAME.startsWith( "linux" );
  public static final boolean isFreeBSD = _OS_NAME.startsWith( "freebsd" );
  public static final boolean isSolaris = _OS_NAME.startsWith( "sunos" );
  public static final boolean isUnix = !isWindows;

  public static final boolean isFileSystemCaseSensitive = isUnix && !isMac;

  private static final String ARCH_DATA_MODEL = System.getProperty( "sun.arch.data.model" );
  public static final boolean is32Bit = ARCH_DATA_MODEL == null || ARCH_DATA_MODEL.equals( "32" );
  public static final boolean is64Bit = !is32Bit;
}