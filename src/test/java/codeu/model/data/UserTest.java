// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package codeu.model.data;

import java.time.Instant;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {

  @Test
  public void testCreate() {
    UUID id = UUID.randomUUID();
    String name = "test_username";
    String password = "test_password";
    Instant creation = Instant.now();
    String about = "";

    User user = new User(id, name, creation, password, about);

    Assert.assertEquals(id, user.getId());
    Assert.assertEquals(name, user.getName());
    Assert.assertEquals(creation, user.getCreationTime());
    Assert.assertEquals(about, user.getAbout());

    user.setAbout("test about me");
    Assert.assertEquals("test about me", user.getAbout());
  }
}
