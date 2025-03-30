/*
 * Salesforce Plugin for SonarQube
 * Copyright (C) 2018-2017 Salesforce.org
 * esteele@salesforce.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.salesforce.parser.element;

import java.util.ArrayList;
import java.util.Collection;

public class ScanInfo {

  private String engineVersion;
  private String scanDate;
  private Collection<DataSource> dataSources = new ArrayList<>();

  public String getEngineVersion() {
    return engineVersion;
  }

  public void setEngineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
  }

  public Collection<DataSource> getDataSources() {
    return dataSources;
  }

  public void setDataSources(Collection<DataSource> dataSources) {
    this.dataSources = dataSources;
  }

  public String getScanDate() {
    return scanDate;
  }

  public void setScanDate(String scanDate) {
    this.scanDate = scanDate;
  }
}
