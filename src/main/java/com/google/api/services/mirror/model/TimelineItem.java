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
 * Each item in the user's timeline is represented as a TimelineItem JSON structure, described
 * below.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Mirror API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimelineItem extends com.google.api.client.json.GenericJson {

  /**
   * A list of media attachments associated with this item. As a convenience, you can refer to
   * attachments in your HTML payloads with the attachment or cid scheme. For example: - attachment:
   * where attachment_index is the 0-based index of this array.  - cid:  where attachment_id is the
   * ID of the attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Attachment> attachments;

  /**
   * The bundle ID for this item. Services can specify a bundleId to group many items together. They
   * appear under a single top-level item on the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bundleId;

  /**
   * A canonical URL pointing to the canonical/high quality version of the data represented by the
   * timeline item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String canonicalUrl;

  /**
   * The time at which this item was created, formatted according to RFC 3339.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime created;

  /**
   * The user or group that created this item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Contact creator;

  /**
   * The time that should be displayed when this item is viewed in the timeline, formatted according
   * to RFC 3339. This user's timeline is sorted chronologically on display time, so this will also
   * determine where the item is displayed in the timeline. If not set by the service, the display
   * time defaults to the updated time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime displayTime;

  /**
   * ETag for this item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * HTML content for this item. If both text and html are provided for an item, the html will be
   * rendered in the timeline. Allowed HTML elements - You can use these elements in your timeline
   * cards.   - Headers: h1, h2, h3, h4, h5, h6  - Images: img  - Lists: li, ol, ul  - HTML5
   * semantics: article, aside, details, figure, figcaption, footer, header, nav, section, summary,
   * time  - Structural: blockquote, br, div, hr, p, span  - Style: b, big, center, em, i, u, s,
   * small, strike, strong, style, sub, sup  - Tables: table, tbody, td, tfoot, th, thead, tr
   * Blocked HTML elements: These elements and their contents are removed from HTML payloads.   -
   * Document headers: head, title  - Embeds: audio, embed, object, source, video  - Frames: frame,
   * frameset  - Scripting: applet, script   Other elements: Any elements that aren't listed are
   * removed, but their contents are preserved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String html;

  /**
   * This field is deprecated, use the html property with pagination instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> htmlPages;

  /**
   * The ID of the timeline item. This is unique within a user's timeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * If this item was generated as a reply to another item, this field will be set to the ID of the
   * item being replied to. This can be used to attach a reply to the appropriate conversation or
   * post.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inReplyTo;

  /**
   * Whether this item is a bundle cover.
   *
   * If an item is marked as a bundle cover, it will be the entry point to the bundle of items that
   * have the same bundleId as that item. It will be shown only on the main timeline — not within
   * the opened bundle.
   *
   * On the main timeline, items that are shown are:   - Items that have isBundleCover set to true
   * - Items that do not have a bundleId  In a bundle sub-timeline, items that are shown are:   -
   * Items that have the bundleId in question AND isBundleCover set to false
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isBundleCover;

  /**
   * When true, indicates this item is deleted, and only the ID property is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDeleted;

  /**
   * When true, indicates this item is pinned, which means it's grouped alongside "active" items
   * like navigation and hangouts, on the opposite side of the home screen from historical (non-
   * pinned) timeline items. You can allow the user to toggle the value of this property with the
   * TOGGLE_PINNED built-in menu item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isPinned;

  /**
   * The type of resource. This is always mirror#timelineItem.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The geographic location associated with this item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Location location;

  /**
   * A list of menu items that will be presented to the user when this item is selected in the
   * timeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MenuItem> menuItems;

  /**
   * Controls how notifications for this item are presented on the device. If this is missing, no
   * notification will be generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NotificationConfig notification;

  /**
   * For pinned items, this determines the order in which the item is displayed in the timeline,
   * with a higher score appearing closer to the clock. Note: setting this field is currently not
   * supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pinScore;

  /**
   * A list of users or groups that this item has been shared with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Contact> recipients;

  /**
   * A URL that can be used to retrieve this item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Opaque string you can use to map a timeline item to data in your own service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceItemId;

  /**
   * The speakable version of the content of this item. Along with the READ_ALOUD menu item, use
   * this field to provide text that would be clearer when read aloud, or to provide extended
   * information to what is displayed visually on Glass.
   *
   * Glassware should also specify the speakableType field, which will be spoken before this text in
   * cases where the additional context is useful, for example when the user requests that the item
   * be read aloud following a notification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String speakableText;

  /**
   * A speakable description of the type of this item. This will be announced to the user prior to
   * reading the content of the item in cases where the additional context is useful, for example
   * when the user requests that the item be read aloud following a notification.
   *
   * This should be a short, simple noun phrase such as "Email", "Text message", or "Daily Planet
   * News Update".
   *
   * Glassware are encouraged to populate this field for every timeline item, even if the item does
   * not contain speakableText or text so that the user can learn the type of the item without
   * looking at the screen.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String speakableType;

  /**
   * Text content of this item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * The title of this item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The time at which this item was last modified, formatted according to RFC 3339.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime updated;

  /**
   * A list of media attachments associated with this item. As a convenience, you can refer to
   * attachments in your HTML payloads with the attachment or cid scheme. For example: - attachment:
   * where attachment_index is the 0-based index of this array.  - cid:  where attachment_id is the
   * ID of the attachment.
   * @return value or {@code null} for none
   */
  public java.util.List<Attachment> getAttachments() {
    return attachments;
  }

  /**
   * A list of media attachments associated with this item. As a convenience, you can refer to
   * attachments in your HTML payloads with the attachment or cid scheme. For example: - attachment:
   * where attachment_index is the 0-based index of this array.  - cid:  where attachment_id is the
   * ID of the attachment.
   * @param attachments attachments or {@code null} for none
   */
  public TimelineItem setAttachments(java.util.List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  /**
   * The bundle ID for this item. Services can specify a bundleId to group many items together. They
   * appear under a single top-level item on the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getBundleId() {
    return bundleId;
  }

  /**
   * The bundle ID for this item. Services can specify a bundleId to group many items together. They
   * appear under a single top-level item on the device.
   * @param bundleId bundleId or {@code null} for none
   */
  public TimelineItem setBundleId(java.lang.String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * A canonical URL pointing to the canonical/high quality version of the data represented by the
   * timeline item.
   * @return value or {@code null} for none
   */
  public java.lang.String getCanonicalUrl() {
    return canonicalUrl;
  }

  /**
   * A canonical URL pointing to the canonical/high quality version of the data represented by the
   * timeline item.
   * @param canonicalUrl canonicalUrl or {@code null} for none
   */
  public TimelineItem setCanonicalUrl(java.lang.String canonicalUrl) {
    this.canonicalUrl = canonicalUrl;
    return this;
  }

  /**
   * The time at which this item was created, formatted according to RFC 3339.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getCreated() {
    return created;
  }

  /**
   * The time at which this item was created, formatted according to RFC 3339.
   * @param created created or {@code null} for none
   */
  public TimelineItem setCreated(com.google.api.client.util.DateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The user or group that created this item.
   * @return value or {@code null} for none
   */
  public Contact getCreator() {
    return creator;
  }

  /**
   * The user or group that created this item.
   * @param creator creator or {@code null} for none
   */
  public TimelineItem setCreator(Contact creator) {
    this.creator = creator;
    return this;
  }

  /**
   * The time that should be displayed when this item is viewed in the timeline, formatted according
   * to RFC 3339. This user's timeline is sorted chronologically on display time, so this will also
   * determine where the item is displayed in the timeline. If not set by the service, the display
   * time defaults to the updated time.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getDisplayTime() {
    return displayTime;
  }

  /**
   * The time that should be displayed when this item is viewed in the timeline, formatted according
   * to RFC 3339. This user's timeline is sorted chronologically on display time, so this will also
   * determine where the item is displayed in the timeline. If not set by the service, the display
   * time defaults to the updated time.
   * @param displayTime displayTime or {@code null} for none
   */
  public TimelineItem setDisplayTime(com.google.api.client.util.DateTime displayTime) {
    this.displayTime = displayTime;
    return this;
  }

  /**
   * ETag for this item.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag for this item.
   * @param etag etag or {@code null} for none
   */
  public TimelineItem setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * HTML content for this item. If both text and html are provided for an item, the html will be
   * rendered in the timeline. Allowed HTML elements - You can use these elements in your timeline
   * cards.   - Headers: h1, h2, h3, h4, h5, h6  - Images: img  - Lists: li, ol, ul  - HTML5
   * semantics: article, aside, details, figure, figcaption, footer, header, nav, section, summary,
   * time  - Structural: blockquote, br, div, hr, p, span  - Style: b, big, center, em, i, u, s,
   * small, strike, strong, style, sub, sup  - Tables: table, tbody, td, tfoot, th, thead, tr
   * Blocked HTML elements: These elements and their contents are removed from HTML payloads.   -
   * Document headers: head, title  - Embeds: audio, embed, object, source, video  - Frames: frame,
   * frameset  - Scripting: applet, script   Other elements: Any elements that aren't listed are
   * removed, but their contents are preserved.
   * @return value or {@code null} for none
   */
  public java.lang.String getHtml() {
    return html;
  }

  /**
   * HTML content for this item. If both text and html are provided for an item, the html will be
   * rendered in the timeline. Allowed HTML elements - You can use these elements in your timeline
   * cards.   - Headers: h1, h2, h3, h4, h5, h6  - Images: img  - Lists: li, ol, ul  - HTML5
   * semantics: article, aside, details, figure, figcaption, footer, header, nav, section, summary,
   * time  - Structural: blockquote, br, div, hr, p, span  - Style: b, big, center, em, i, u, s,
   * small, strike, strong, style, sub, sup  - Tables: table, tbody, td, tfoot, th, thead, tr
   * Blocked HTML elements: These elements and their contents are removed from HTML payloads.   -
   * Document headers: head, title  - Embeds: audio, embed, object, source, video  - Frames: frame,
   * frameset  - Scripting: applet, script   Other elements: Any elements that aren't listed are
   * removed, but their contents are preserved.
   * @param html html or {@code null} for none
   */
  public TimelineItem setHtml(java.lang.String html) {
    this.html = html;
    return this;
  }

  /**
   * This field is deprecated, use the html property with pagination instead.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getHtmlPages() {
    return htmlPages;
  }

  /**
   * This field is deprecated, use the html property with pagination instead.
   * @param htmlPages htmlPages or {@code null} for none
   */
  public TimelineItem setHtmlPages(java.util.List<java.lang.String> htmlPages) {
    this.htmlPages = htmlPages;
    return this;
  }

  /**
   * The ID of the timeline item. This is unique within a user's timeline.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the timeline item. This is unique within a user's timeline.
   * @param id id or {@code null} for none
   */
  public TimelineItem setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * If this item was generated as a reply to another item, this field will be set to the ID of the
   * item being replied to. This can be used to attach a reply to the appropriate conversation or
   * post.
   * @return value or {@code null} for none
   */
  public java.lang.String getInReplyTo() {
    return inReplyTo;
  }

  /**
   * If this item was generated as a reply to another item, this field will be set to the ID of the
   * item being replied to. This can be used to attach a reply to the appropriate conversation or
   * post.
   * @param inReplyTo inReplyTo or {@code null} for none
   */
  public TimelineItem setInReplyTo(java.lang.String inReplyTo) {
    this.inReplyTo = inReplyTo;
    return this;
  }

  /**
   * Whether this item is a bundle cover.
   *
   * If an item is marked as a bundle cover, it will be the entry point to the bundle of items that
   * have the same bundleId as that item. It will be shown only on the main timeline — not within
   * the opened bundle.
   *
   * On the main timeline, items that are shown are:   - Items that have isBundleCover set to true
   * - Items that do not have a bundleId  In a bundle sub-timeline, items that are shown are:   -
   * Items that have the bundleId in question AND isBundleCover set to false
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsBundleCover() {
    return isBundleCover;
  }

  /**
   * Whether this item is a bundle cover.
   *
   * If an item is marked as a bundle cover, it will be the entry point to the bundle of items that
   * have the same bundleId as that item. It will be shown only on the main timeline — not within
   * the opened bundle.
   *
   * On the main timeline, items that are shown are:   - Items that have isBundleCover set to true
   * - Items that do not have a bundleId  In a bundle sub-timeline, items that are shown are:   -
   * Items that have the bundleId in question AND isBundleCover set to false
   * @param isBundleCover isBundleCover or {@code null} for none
   */
  public TimelineItem setIsBundleCover(java.lang.Boolean isBundleCover) {
    this.isBundleCover = isBundleCover;
    return this;
  }

  /**
   * When true, indicates this item is deleted, and only the ID property is set.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDeleted() {
    return isDeleted;
  }

  /**
   * When true, indicates this item is deleted, and only the ID property is set.
   * @param isDeleted isDeleted or {@code null} for none
   */
  public TimelineItem setIsDeleted(java.lang.Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * When true, indicates this item is pinned, which means it's grouped alongside "active" items
   * like navigation and hangouts, on the opposite side of the home screen from historical (non-
   * pinned) timeline items. You can allow the user to toggle the value of this property with the
   * TOGGLE_PINNED built-in menu item.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsPinned() {
    return isPinned;
  }

  /**
   * When true, indicates this item is pinned, which means it's grouped alongside "active" items
   * like navigation and hangouts, on the opposite side of the home screen from historical (non-
   * pinned) timeline items. You can allow the user to toggle the value of this property with the
   * TOGGLE_PINNED built-in menu item.
   * @param isPinned isPinned or {@code null} for none
   */
  public TimelineItem setIsPinned(java.lang.Boolean isPinned) {
    this.isPinned = isPinned;
    return this;
  }

  /**
   * The type of resource. This is always mirror#timelineItem.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The type of resource. This is always mirror#timelineItem.
   * @param kind kind or {@code null} for none
   */
  public TimelineItem setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The geographic location associated with this item.
   * @return value or {@code null} for none
   */
  public Location getLocation() {
    return location;
  }

  /**
   * The geographic location associated with this item.
   * @param location location or {@code null} for none
   */
  public TimelineItem setLocation(Location location) {
    this.location = location;
    return this;
  }

  /**
   * A list of menu items that will be presented to the user when this item is selected in the
   * timeline.
   * @return value or {@code null} for none
   */
  public java.util.List<MenuItem> getMenuItems() {
    return menuItems;
  }

  /**
   * A list of menu items that will be presented to the user when this item is selected in the
   * timeline.
   * @param menuItems menuItems or {@code null} for none
   */
  public TimelineItem setMenuItems(java.util.List<MenuItem> menuItems) {
    this.menuItems = menuItems;
    return this;
  }

  /**
   * Controls how notifications for this item are presented on the device. If this is missing, no
   * notification will be generated.
   * @return value or {@code null} for none
   */
  public NotificationConfig getNotification() {
    return notification;
  }

  /**
   * Controls how notifications for this item are presented on the device. If this is missing, no
   * notification will be generated.
   * @param notification notification or {@code null} for none
   */
  public TimelineItem setNotification(NotificationConfig notification) {
    this.notification = notification;
    return this;
  }

  /**
   * For pinned items, this determines the order in which the item is displayed in the timeline,
   * with a higher score appearing closer to the clock. Note: setting this field is currently not
   * supported.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPinScore() {
    return pinScore;
  }

  /**
   * For pinned items, this determines the order in which the item is displayed in the timeline,
   * with a higher score appearing closer to the clock. Note: setting this field is currently not
   * supported.
   * @param pinScore pinScore or {@code null} for none
   */
  public TimelineItem setPinScore(java.lang.Integer pinScore) {
    this.pinScore = pinScore;
    return this;
  }

  /**
   * A list of users or groups that this item has been shared with.
   * @return value or {@code null} for none
   */
  public java.util.List<Contact> getRecipients() {
    return recipients;
  }

  /**
   * A list of users or groups that this item has been shared with.
   * @param recipients recipients or {@code null} for none
   */
  public TimelineItem setRecipients(java.util.List<Contact> recipients) {
    this.recipients = recipients;
    return this;
  }

  /**
   * A URL that can be used to retrieve this item.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * A URL that can be used to retrieve this item.
   * @param selfLink selfLink or {@code null} for none
   */
  public TimelineItem setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Opaque string you can use to map a timeline item to data in your own service.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceItemId() {
    return sourceItemId;
  }

  /**
   * Opaque string you can use to map a timeline item to data in your own service.
   * @param sourceItemId sourceItemId or {@code null} for none
   */
  public TimelineItem setSourceItemId(java.lang.String sourceItemId) {
    this.sourceItemId = sourceItemId;
    return this;
  }

  /**
   * The speakable version of the content of this item. Along with the READ_ALOUD menu item, use
   * this field to provide text that would be clearer when read aloud, or to provide extended
   * information to what is displayed visually on Glass.
   *
   * Glassware should also specify the speakableType field, which will be spoken before this text in
   * cases where the additional context is useful, for example when the user requests that the item
   * be read aloud following a notification.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpeakableText() {
    return speakableText;
  }

  /**
   * The speakable version of the content of this item. Along with the READ_ALOUD menu item, use
   * this field to provide text that would be clearer when read aloud, or to provide extended
   * information to what is displayed visually on Glass.
   *
   * Glassware should also specify the speakableType field, which will be spoken before this text in
   * cases where the additional context is useful, for example when the user requests that the item
   * be read aloud following a notification.
   * @param speakableText speakableText or {@code null} for none
   */
  public TimelineItem setSpeakableText(java.lang.String speakableText) {
    this.speakableText = speakableText;
    return this;
  }

  /**
   * A speakable description of the type of this item. This will be announced to the user prior to
   * reading the content of the item in cases where the additional context is useful, for example
   * when the user requests that the item be read aloud following a notification.
   *
   * This should be a short, simple noun phrase such as "Email", "Text message", or "Daily Planet
   * News Update".
   *
   * Glassware are encouraged to populate this field for every timeline item, even if the item does
   * not contain speakableText or text so that the user can learn the type of the item without
   * looking at the screen.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpeakableType() {
    return speakableType;
  }

  /**
   * A speakable description of the type of this item. This will be announced to the user prior to
   * reading the content of the item in cases where the additional context is useful, for example
   * when the user requests that the item be read aloud following a notification.
   *
   * This should be a short, simple noun phrase such as "Email", "Text message", or "Daily Planet
   * News Update".
   *
   * Glassware are encouraged to populate this field for every timeline item, even if the item does
   * not contain speakableText or text so that the user can learn the type of the item without
   * looking at the screen.
   * @param speakableType speakableType or {@code null} for none
   */
  public TimelineItem setSpeakableType(java.lang.String speakableType) {
    this.speakableType = speakableType;
    return this;
  }

  /**
   * Text content of this item.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Text content of this item.
   * @param text text or {@code null} for none
   */
  public TimelineItem setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  /**
   * The title of this item.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of this item.
   * @param title title or {@code null} for none
   */
  public TimelineItem setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * The time at which this item was last modified, formatted according to RFC 3339.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getUpdated() {
    return updated;
  }

  /**
   * The time at which this item was last modified, formatted according to RFC 3339.
   * @param updated updated or {@code null} for none
   */
  public TimelineItem setUpdated(com.google.api.client.util.DateTime updated) {
    this.updated = updated;
    return this;
  }

  @Override
  public TimelineItem set(String fieldName, Object value) {
    return (TimelineItem) super.set(fieldName, value);
  }

  @Override
  public TimelineItem clone() {
    return (TimelineItem) super.clone();
  }

}
