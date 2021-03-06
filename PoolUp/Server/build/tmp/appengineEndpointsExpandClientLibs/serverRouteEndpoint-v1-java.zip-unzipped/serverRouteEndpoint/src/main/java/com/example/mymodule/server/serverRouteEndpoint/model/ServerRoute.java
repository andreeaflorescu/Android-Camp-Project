/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-07-22 21:53:01 UTC)
 * on 2014-08-01 at 11:24:18 UTC 
 * Modify at your own risk.
 */

package com.example.mymodule.server.serverRouteEndpoint.model;

/**
 * Model definition for ServerRoute.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the serverRouteEndpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServerRoute extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer availableSeats;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer date;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String driver;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double endLatitude;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double endLongitude;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer hour;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minute;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer month;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> passengers;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer price;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double startLatitude;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double startLongitude;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer year;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAvailableSeats() {
    return availableSeats;
  }

  /**
   * @param availableSeats availableSeats or {@code null} for none
   */
  public ServerRoute setAvailableSeats(java.lang.Integer availableSeats) {
    this.availableSeats = availableSeats;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDate() {
    return date;
  }

  /**
   * @param date date or {@code null} for none
   */
  public ServerRoute setDate(java.lang.Integer date) {
    this.date = date;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDriver() {
    return driver;
  }

  /**
   * @param driver driver or {@code null} for none
   */
  public ServerRoute setDriver(java.lang.String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getEndLatitude() {
    return endLatitude;
  }

  /**
   * @param endLatitude endLatitude or {@code null} for none
   */
  public ServerRoute setEndLatitude(java.lang.Double endLatitude) {
    this.endLatitude = endLatitude;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getEndLongitude() {
    return endLongitude;
  }

  /**
   * @param endLongitude endLongitude or {@code null} for none
   */
  public ServerRoute setEndLongitude(java.lang.Double endLongitude) {
    this.endLongitude = endLongitude;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHour() {
    return hour;
  }

  /**
   * @param hour hour or {@code null} for none
   */
  public ServerRoute setHour(java.lang.Integer hour) {
    this.hour = hour;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public ServerRoute setId(java.lang.Integer id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinute() {
    return minute;
  }

  /**
   * @param minute minute or {@code null} for none
   */
  public ServerRoute setMinute(java.lang.Integer minute) {
    this.minute = minute;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMonth() {
    return month;
  }

  /**
   * @param month month or {@code null} for none
   */
  public ServerRoute setMonth(java.lang.Integer month) {
    this.month = month;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPassengers() {
    return passengers;
  }

  /**
   * @param passengers passengers or {@code null} for none
   */
  public ServerRoute setPassengers(java.util.List<java.lang.String> passengers) {
    this.passengers = passengers;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPrice() {
    return price;
  }

  /**
   * @param price price or {@code null} for none
   */
  public ServerRoute setPrice(java.lang.Integer price) {
    this.price = price;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getStartLatitude() {
    return startLatitude;
  }

  /**
   * @param startLatitude startLatitude or {@code null} for none
   */
  public ServerRoute setStartLatitude(java.lang.Double startLatitude) {
    this.startLatitude = startLatitude;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getStartLongitude() {
    return startLongitude;
  }

  /**
   * @param startLongitude startLongitude or {@code null} for none
   */
  public ServerRoute setStartLongitude(java.lang.Double startLongitude) {
    this.startLongitude = startLongitude;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getYear() {
    return year;
  }

  /**
   * @param year year or {@code null} for none
   */
  public ServerRoute setYear(java.lang.Integer year) {
    this.year = year;
    return this;
  }

  @Override
  public ServerRoute set(String fieldName, Object value) {
    return (ServerRoute) super.set(fieldName, value);
  }

  @Override
  public ServerRoute clone() {
    return (ServerRoute) super.clone();
  }

}
