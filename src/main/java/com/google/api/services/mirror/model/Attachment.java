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
 * Represents media content, such as a photo, that can be attached to a timeline item.
 * 
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into the JSON that is transmitted over HTTP
 * when working with the Google Mirror API. For a detailed explanation see: <a
 * href="http://code.google.com/p/google-http-java-client/wiki/JSON"
 * >http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 * 
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Attachment extends com.google.api.client.json.GenericJson {

    /**
     * The MIME type of the attachment. The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String contentType;

    /**
     * The URL for the content. The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String contentUrl;

    /**
     * The ID of the attachment. The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * Indicates that the contentUrl is not available because the attachment content is still being processed. If the
     * caller wishes to retrieve the content, it should try again later. The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean isProcessingContent;

    /**
     * The MIME type of the attachment.
     * 
     * @return value or {@code null} for none
     */
    public java.lang.String getContentType() {
        return contentType;
    }

    /**
     * The MIME type of the attachment.
     * 
     * @param contentType contentType or {@code null} for none
     */
    public Attachment setContentType(java.lang.String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * The URL for the content.
     * 
     * @return value or {@code null} for none
     */
    public java.lang.String getContentUrl() {
        return contentUrl;
    }

    /**
     * The URL for the content.
     * 
     * @param contentUrl contentUrl or {@code null} for none
     */
    public Attachment setContentUrl(java.lang.String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    /**
     * The ID of the attachment.
     * 
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * The ID of the attachment.
     * 
     * @param id id or {@code null} for none
     */
    public Attachment setId(java.lang.String id) {
        this.id = id;
        return this;
    }

    /**
     * Indicates that the contentUrl is not available because the attachment content is still being processed. If the
     * caller wishes to retrieve the content, it should try again later.
     * 
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getIsProcessingContent() {
        return isProcessingContent;
    }

    /**
     * Indicates that the contentUrl is not available because the attachment content is still being processed. If the
     * caller wishes to retrieve the content, it should try again later.
     * 
     * @param isProcessingContent isProcessingContent or {@code null} for none
     */
    public Attachment setIsProcessingContent(java.lang.Boolean isProcessingContent) {
        this.isProcessingContent = isProcessingContent;
        return this;
    }

    @Override
    public Attachment set(String fieldName, Object value) {
        return (Attachment) super.set(fieldName, value);
    }

    @Override
    public Attachment clone() {
        return (Attachment) super.clone();
    }

}
