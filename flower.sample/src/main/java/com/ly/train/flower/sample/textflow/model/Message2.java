/**
 * Copyright © 2019 同程艺龙 (zhihui.li@ly.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ly.train.flower.sample.textflow.model;

import java.io.Serializable;

public class Message2 implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private String name;
  private int age;
  private int id;

  public Message2() {}

  public Message2(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Message2 [name=");
    builder.append(name);
    builder.append(", age=");
    builder.append(age);
    builder.append(", id=");
    builder.append(id);
    builder.append("]");
    return builder.toString();
  }

}