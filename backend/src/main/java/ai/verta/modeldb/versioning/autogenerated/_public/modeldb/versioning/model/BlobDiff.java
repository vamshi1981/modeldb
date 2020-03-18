// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import ai.verta.modeldb.versioning.blob.diff.Function3;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.random.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BlobDiff implements ProtoType {
  public List<String> Location;
  public DiffStatusEnumDiffStatus Status;
  public DatasetDiff Dataset;
  public EnvironmentDiff Environment;
  public CodeDiff Code;
  public ConfigDiff Config;

  public BlobDiff() {
    this.Location = null;
    this.Status = null;
    this.Dataset = null;
    this.Environment = null;
    this.Code = null;
    this.Config = null;
  }

  public Boolean isEmpty() {
    if (this.Location != null && !this.Location.equals(null) && !this.Location.isEmpty()) {
      return false;
    }
    if (this.Status != null && !this.Status.equals(null)) {
      return false;
    }
    if (this.Dataset != null && !this.Dataset.equals(null)) {
      return false;
    }
    if (this.Environment != null && !this.Environment.equals(null)) {
      return false;
    }
    if (this.Code != null && !this.Code.equals(null)) {
      return false;
    }
    if (this.Config != null && !this.Config.equals(null)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "{\"class\": \"BlobDiff\",\"fields\": {"
        + "\"Location\": "
        + Location
        + ", "
        + "\"Status\": "
        + Status
        + ", "
        + "\"Dataset\": "
        + Dataset
        + ", "
        + "\"Environment\": "
        + Environment
        + ", "
        + "\"Code\": "
        + Code
        + ", "
        + "\"Config\": "
        + Config
        + "}}";
  }

  // TODO: not consider order on lists
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    if (!(o instanceof BlobDiff)) return false;
    BlobDiff other = (BlobDiff) o;

    {
      Function3<List<String>, List<String>, Boolean> f =
          (x2, y2) ->
              IntStream.range(0, Math.min(x2.size(), y2.size()))
                  .mapToObj(
                      i -> {
                        Function3<String, String, Boolean> f2 = (x, y) -> x.equals(y);
                        return f2.apply(x2.get(i), y2.get(i));
                      })
                  .filter(x -> x.equals(false))
                  .collect(Collectors.toList())
                  .isEmpty();
      if (this.Location != null || other.Location != null) {
        if (this.Location == null && other.Location != null) return false;
        if (this.Location != null && other.Location == null) return false;
        if (!f.apply(this.Location, other.Location)) return false;
      }
    }
    {
      Function3<DiffStatusEnumDiffStatus, DiffStatusEnumDiffStatus, Boolean> f =
          (x, y) -> x.equals(y);
      if (this.Status != null || other.Status != null) {
        if (this.Status == null && other.Status != null) return false;
        if (this.Status != null && other.Status == null) return false;
        if (!f.apply(this.Status, other.Status)) return false;
      }
    }
    {
      Function3<DatasetDiff, DatasetDiff, Boolean> f = (x, y) -> x.equals(y);
      if (this.Dataset != null || other.Dataset != null) {
        if (this.Dataset == null && other.Dataset != null) return false;
        if (this.Dataset != null && other.Dataset == null) return false;
        if (!f.apply(this.Dataset, other.Dataset)) return false;
      }
    }
    {
      Function3<EnvironmentDiff, EnvironmentDiff, Boolean> f = (x, y) -> x.equals(y);
      if (this.Environment != null || other.Environment != null) {
        if (this.Environment == null && other.Environment != null) return false;
        if (this.Environment != null && other.Environment == null) return false;
        if (!f.apply(this.Environment, other.Environment)) return false;
      }
    }
    {
      Function3<CodeDiff, CodeDiff, Boolean> f = (x, y) -> x.equals(y);
      if (this.Code != null || other.Code != null) {
        if (this.Code == null && other.Code != null) return false;
        if (this.Code != null && other.Code == null) return false;
        if (!f.apply(this.Code, other.Code)) return false;
      }
    }
    {
      Function3<ConfigDiff, ConfigDiff, Boolean> f = (x, y) -> x.equals(y);
      if (this.Config != null || other.Config != null) {
        if (this.Config == null && other.Config != null) return false;
        if (this.Config != null && other.Config == null) return false;
        if (!f.apply(this.Config, other.Config)) return false;
      }
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        this.Location, this.Status, this.Dataset, this.Environment, this.Code, this.Config);
  }

  public BlobDiff setLocation(List<String> value) {
    this.Location = Utils.removeEmpty(value);
    return this;
  }

  public BlobDiff setStatus(DiffStatusEnumDiffStatus value) {
    this.Status = Utils.removeEmpty(value);
    return this;
  }

  public BlobDiff setDataset(DatasetDiff value) {
    this.Dataset = Utils.removeEmpty(value);
    return this;
  }

  public BlobDiff setEnvironment(EnvironmentDiff value) {
    this.Environment = Utils.removeEmpty(value);
    return this;
  }

  public BlobDiff setCode(CodeDiff value) {
    this.Code = Utils.removeEmpty(value);
    return this;
  }

  public BlobDiff setConfig(ConfigDiff value) {
    this.Config = Utils.removeEmpty(value);
    return this;
  }

  public static BlobDiff fromProto(ai.verta.modeldb.versioning.BlobDiff blob) {
    if (blob == null) {
      return null;
    }

    BlobDiff obj = new BlobDiff();
    {
      Function<ai.verta.modeldb.versioning.BlobDiff, List<String>> f = x -> blob.getLocationList();
      obj.Location = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<ai.verta.modeldb.versioning.BlobDiff, DiffStatusEnumDiffStatus> f =
          x -> DiffStatusEnumDiffStatus.fromProto(blob.getStatus());
      obj.Status = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<ai.verta.modeldb.versioning.BlobDiff, DatasetDiff> f =
          x -> DatasetDiff.fromProto(blob.getDataset());
      obj.Dataset = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<ai.verta.modeldb.versioning.BlobDiff, EnvironmentDiff> f =
          x -> EnvironmentDiff.fromProto(blob.getEnvironment());
      obj.Environment = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<ai.verta.modeldb.versioning.BlobDiff, CodeDiff> f =
          x -> CodeDiff.fromProto(blob.getCode());
      obj.Code = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<ai.verta.modeldb.versioning.BlobDiff, ConfigDiff> f =
          x -> ConfigDiff.fromProto(blob.getConfig());
      obj.Config = Utils.removeEmpty(f.apply(blob));
    }
    return obj;
  }

  public ai.verta.modeldb.versioning.BlobDiff.Builder toProto() {
    ai.verta.modeldb.versioning.BlobDiff.Builder builder =
        ai.verta.modeldb.versioning.BlobDiff.newBuilder();
    {
      if (this.Location != null && !this.Location.equals(null) && !this.Location.isEmpty()) {
        Function<ai.verta.modeldb.versioning.BlobDiff.Builder, Void> f =
            x -> {
              builder.addAllLocation(this.Location);
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.Status != null && !this.Status.equals(null)) {
        Function<ai.verta.modeldb.versioning.BlobDiff.Builder, Void> f =
            x -> {
              builder.setStatus(this.Status.toProto());
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.Dataset != null && !this.Dataset.equals(null)) {
        Function<ai.verta.modeldb.versioning.BlobDiff.Builder, Void> f =
            x -> {
              builder.setDataset(this.Dataset.toProto());
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.Environment != null && !this.Environment.equals(null)) {
        Function<ai.verta.modeldb.versioning.BlobDiff.Builder, Void> f =
            x -> {
              builder.setEnvironment(this.Environment.toProto());
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.Code != null && !this.Code.equals(null)) {
        Function<ai.verta.modeldb.versioning.BlobDiff.Builder, Void> f =
            x -> {
              builder.setCode(this.Code.toProto());
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.Config != null && !this.Config.equals(null)) {
        Function<ai.verta.modeldb.versioning.BlobDiff.Builder, Void> f =
            x -> {
              builder.setConfig(this.Config.toProto());
              return null;
            };
        f.apply(builder);
      }
    }
    return builder;
  }

  public void preVisitShallow(Visitor visitor) throws ModelDBException {
    visitor.preVisitBlobDiff(this);
  }

  public void preVisitDeep(Visitor visitor) throws ModelDBException {
    this.preVisitShallow(visitor);
    visitor.preVisitDeepListOfString(this.Location);
    visitor.preVisitDeepDiffStatusEnumDiffStatus(this.Status);
    visitor.preVisitDeepDatasetDiff(this.Dataset);
    visitor.preVisitDeepEnvironmentDiff(this.Environment);
    visitor.preVisitDeepCodeDiff(this.Code);
    visitor.preVisitDeepConfigDiff(this.Config);
  }

  public BlobDiff postVisitShallow(Visitor visitor) throws ModelDBException {
    return visitor.postVisitBlobDiff(this);
  }

  public BlobDiff postVisitDeep(Visitor visitor) throws ModelDBException {
    this.setLocation(visitor.postVisitDeepListOfString(this.Location));
    this.setStatus(visitor.postVisitDeepDiffStatusEnumDiffStatus(this.Status));
    this.setDataset(visitor.postVisitDeepDatasetDiff(this.Dataset));
    this.setEnvironment(visitor.postVisitDeepEnvironmentDiff(this.Environment));
    this.setCode(visitor.postVisitDeepCodeDiff(this.Code));
    this.setConfig(visitor.postVisitDeepConfigDiff(this.Config));
    return this.postVisitShallow(visitor);
  }
}
