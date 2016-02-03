package com.rapleaf.jack.test_project.database_1.query;

import java.util.Set;

import com.rapleaf.jack.queries.AbstractDeleteBuilder;
import com.rapleaf.jack.queries.where_operators.IWhereOperator;
import com.rapleaf.jack.queries.where_operators.JackMatchers;
import com.rapleaf.jack.queries.WhereConstraint;
import com.rapleaf.jack.test_project.database_1.iface.ILockableModelPersistence;
import com.rapleaf.jack.test_project.database_1.models.LockableModel;


public class LockableModelDeleteBuilder extends AbstractDeleteBuilder<LockableModel> {

  public LockableModelDeleteBuilder(ILockableModelPersistence caller) {
    super(caller);
  }

  public LockableModelDeleteBuilder id(Long value) {
    addId(value);
    return this;
  }

  public LockableModelDeleteBuilder idIn(Set<Long> values) {
    addIds(values);
    return this;
  }

  public LockableModelDeleteBuilder lockVersion(Integer value) {
    addWhereConstraint(new WhereConstraint<Integer>(LockableModel._Fields.lock_version, JackMatchers.equalTo(value)));
    return this;
  }

  public LockableModelDeleteBuilder whereLockVersion(IWhereOperator<Integer> operator) {
    addWhereConstraint(new WhereConstraint<Integer>(LockableModel._Fields.lock_version, operator));
    return this;
  }

  public LockableModelDeleteBuilder message(String value) {
    addWhereConstraint(new WhereConstraint<String>(LockableModel._Fields.message, JackMatchers.equalTo(value)));
    return this;
  }

  public LockableModelDeleteBuilder whereMessage(IWhereOperator<String> operator) {
    addWhereConstraint(new WhereConstraint<String>(LockableModel._Fields.message, operator));
    return this;
  }

  public LockableModelDeleteBuilder createdAt(Long value) {
    addWhereConstraint(new WhereConstraint<Long>(LockableModel._Fields.created_at, JackMatchers.equalTo(value)));
    return this;
  }

  public LockableModelDeleteBuilder whereCreatedAt(IWhereOperator<Long> operator) {
    addWhereConstraint(new WhereConstraint<Long>(LockableModel._Fields.created_at, operator));
    return this;
  }

  public LockableModelDeleteBuilder updatedAt(Long value) {
    addWhereConstraint(new WhereConstraint<Long>(LockableModel._Fields.updated_at, JackMatchers.equalTo(value)));
    return this;
  }

  public LockableModelDeleteBuilder whereUpdatedAt(IWhereOperator<Long> operator) {
    addWhereConstraint(new WhereConstraint<Long>(LockableModel._Fields.updated_at, operator));
    return this;
  }
}
