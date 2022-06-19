package com.miet.springbootserver.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class UserInfo {

  private int id;
  private String status;

  @Override
  public String toString() {
    return "UserInfo{" +
        "id=" + id +
        ", status='" + status + '\'' +
        '}';
  }
}
