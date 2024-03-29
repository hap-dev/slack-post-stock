package com.github.epw_dev.slack_post_stock.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SlackWebhookType {
  UrlVerification("url_verification"),
  EventCallback("event_callback");

  private String value;
}
