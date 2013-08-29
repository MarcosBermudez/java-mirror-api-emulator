/*
 * Copyright 2010 Google Inc.
 *
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
 * (build: 2013-08-14 15:32:06 UTC)
 * on 2013-08-19 at 21:09:57 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.mirror.model;

/**
 * A list of Attachments. This is the response from the server to GET requests on the attachments
 * collection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Mirror API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AttachmentsListResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of attachments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Attachment> items;

  /**
   * The type of resource. This is always mirror#attachmentsList.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The list of attachments.
   * @return value or {@code null} for none
   */
  public java.util.List<Attachment> getItems() {
    return items;
  }

  /**
   * The list of attachments.
   * @param items items or {@code null} for none
   */
  public AttachmentsListResponse setItems(java.util.List<Attachment> items) {
    this.items = items;
    return this;
  }

  /**
   * The type of resource. This is always mirror#attachmentsList.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The type of resource. This is always mirror#attachmentsList.
   * @param kind kind or {@code null} for none
   */
  public AttachmentsListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public AttachmentsListResponse set(String fieldName, Object value) {
    return (AttachmentsListResponse) super.set(fieldName, value);
  }

  @Override
  public AttachmentsListResponse clone() {
    return (AttachmentsListResponse) super.clone();
  }

}