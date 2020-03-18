// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.generator.java.util.*;
import com.pholser.junit.quickcheck.random.*;
import java.util.*;

public class HyperparameterValuesConfigBlobGen extends Generator<HyperparameterValuesConfigBlob> {
  public HyperparameterValuesConfigBlobGen() {
    super(HyperparameterValuesConfigBlob.class);
  }

  @Override
  public HyperparameterValuesConfigBlob generate(SourceOfRandomness r, GenerationStatus status) {
    // if (r.nextBoolean())
    //     return null;

    HyperparameterValuesConfigBlob obj = new HyperparameterValuesConfigBlob();
    if (r.nextBoolean()) {
      obj.setIntValue(Utils.removeEmpty(gen().type(Long.class).generate(r, status)));
    }
    if (r.nextBoolean()) {
      obj.setFloatValue(Utils.removeEmpty(gen().type(Float.class).generate(r, status)));
    }
    if (r.nextBoolean()) {
      obj.setStringValue(Utils.removeEmpty(new StringGenerator().generate(r, status)));
    }
    return obj;
  }
}
