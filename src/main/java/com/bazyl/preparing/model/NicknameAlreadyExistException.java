package com.bazyl.preparing.model;

public class NicknameAlreadyExistException extends Exception {

  private String message;
  private String nickname;

  public NicknameAlreadyExistException(String message, String nickname) {
    super(message);
    this.message = message;
    this.nickname = nickname;
  }

  @Override
  public String getMessage() {
    return message;
  }

  public String getNickname() {
    return nickname;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder(message);
    sb.append("Illegal nickname:").append(nickname).append('\'');
    return sb.toString();
  }
}
