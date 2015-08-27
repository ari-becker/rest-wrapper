package net.aribecker.restwrapper;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1></h1>
 * <p>
 * <p>Created by Ari Becker on 8/27/15.</p>
 */
public class RestWrapperServerBuilder {
  private List<RestWrapper> wrappers = new ArrayList<>();

  public RestWrapperServerBuilder defaultServer(){
    return this;
  }

  public RestWrapperServerBuilder addRestWrapper(RestWrapper wrapper) {
    wrappers.add(wrapper);
    return this;
  }

  public RestWrapperServer build() {
    return () -> {
    };
  }
}
