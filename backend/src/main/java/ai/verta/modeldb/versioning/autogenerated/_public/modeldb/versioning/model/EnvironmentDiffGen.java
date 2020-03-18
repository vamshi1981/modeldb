// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.generator.java.util.*;
import com.pholser.junit.quickcheck.random.*;
import java.util.*;

public class EnvironmentDiffGen extends Generator<EnvironmentDiff> {
  public EnvironmentDiffGen() {
    super(EnvironmentDiff.class);
  }

  @Override
  public EnvironmentDiff generate(SourceOfRandomness r, GenerationStatus status) {
    // if (r.nextBoolean())
    //     return null;

    EnvironmentDiff obj = new EnvironmentDiff();
    if (r.nextBoolean()) {
      obj.setPython(Utils.removeEmpty(gen().type(PythonEnvironmentDiff.class).generate(r, status)));
    }
    if (r.nextBoolean()) {
      obj.setDocker(Utils.removeEmpty(gen().type(DockerEnvironmentDiff.class).generate(r, status)));
    }
    if (r.nextBoolean()) {
      int size = r.nextInt(0, 10);
      List<EnvironmentVariablesDiff> ret = new ArrayList(size);
      for (int i = 0; i < size; i++) {
        ret.add(gen().type(EnvironmentVariablesDiff.class).generate(r, status));
      }
      obj.setEnvironmentVariables(Utils.removeEmpty(ret));
    }
    if (r.nextBoolean()) {
      obj.setCommandLine(
          Utils.removeEmpty(gen().type(CommandLineEnvironmentDiff.class).generate(r, status)));
    }
    return obj;
  }
}
