// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.generator.java.util.*;
import com.pholser.junit.quickcheck.random.*;
import java.util.*;

public class BlobDiffGen extends Generator<BlobDiff> {
  public BlobDiffGen() {
    super(BlobDiff.class);
  }

  @Override
  public BlobDiff generate(SourceOfRandomness r, GenerationStatus status) {
    // if (r.nextBoolean())
    //     return null;

    BlobDiff obj = new BlobDiff();
    if (r.nextBoolean()) {
      int size = r.nextInt(0, 10);
      List<String> ret = new ArrayList(size);
      for (int i = 0; i < size; i++) {
        ret.add(new StringGenerator().generate(r, status));
      }
      obj.setLocation(Utils.removeEmpty(ret));
    }
    if (r.nextBoolean()) {
      obj.setStatus(
          Utils.removeEmpty(gen().type(DiffStatusEnumDiffStatus.class).generate(r, status)));
    }
    if (r.nextBoolean()) {
      obj.setDataset(Utils.removeEmpty(gen().type(DatasetDiff.class).generate(r, status)));
    }
    if (r.nextBoolean()) {
      obj.setEnvironment(Utils.removeEmpty(gen().type(EnvironmentDiff.class).generate(r, status)));
    }
    if (r.nextBoolean()) {
      obj.setCode(Utils.removeEmpty(gen().type(CodeDiff.class).generate(r, status)));
    }
    if (r.nextBoolean()) {
      obj.setConfig(Utils.removeEmpty(gen().type(ConfigDiff.class).generate(r, status)));
    }
    return obj;
  }
}
