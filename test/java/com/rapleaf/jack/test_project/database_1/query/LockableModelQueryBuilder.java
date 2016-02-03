package com.rapleaf.jack.test_project.database_1.query;

import java.util.Set;

import com.rapleaf.jack.queries.AbstractQueryBuilder;
import com.rapleaf.jack.queries.Column;
import com.rapleaf.jack.queries.FieldSelector;
import com.rapleaf.jack.queries.where_operators.IWhereOperator;
import com.rapleaf.jack.queries.where_operators.JackMatchers;
import com.rapleaf.jack.queries.WhereConstraint;
import com.rapleaf.jack.queries.QueryOrder;
import com.rapleaf.jack.queries.OrderCriterion;
import com.rapleaf.jack.queries.LimitCriterion;
import com.rapleaf.jack.test_project.database_1.iface.ILockableModelPersistence;
import com.rapleaf.jack.test_project.database_1.models.LockableModel;


public class LockableModelQueryBuilder extends AbstractQueryBuilder<LockableModel> {

  public LockableModelQueryBuilder(ILockableModelPersistence caller) {
    super(caller);
  }

  public LockableModelQueryBuilder select(LockableModel._Fields... fields) {
    for (LockableModel._Fields field : fields){
      addSelectedField(new FieldSelector(field));
    }
    return this;
  }

  public LockableModelQueryBuilder selectAgg(FieldSelector... aggregatedFields) {
    addSelectedFields(aggregatedFields);
    return this;
  }

  public LockableModelQueryBuilder id(Long value) {
    addId(value);
    return this;
  }

  public LockableModelQueryBuilder idIn(Set<Long> values) {
    addIds(values);
    return this;
  }

  public LockableModelQueryBuilder whereId(IWhereOperator<Long> operator) {
    addWhereConstraint(new WhereConstraint<Long>(Column.fromId(null), operator, null));
    return this;
  }

  public LockableModelQueryBuilder limit(int offset, int nResults) {
    setLimit(new LimitCriterion(offset, nResults));
    return this;
  }

  public LockableModelQueryBuilder limit(int nResults) {
    setLimit(new LimitCriterion(nResults));
    return this;
  }

  public LockableModelQueryBuilder groupBy(LockableModel._Fields... fields) {
    addGroupByFields(fields);
    return this;
  }

  public LockableModelQueryBuilder order() {
    this.addOrder(new OrderCriterion(QueryOrder.ASC));
    return this;
  }

  public LockableModelQueryBuilder order(QueryOrder queryOrder) {
    this.addOrder(new OrderCriterion(queryOrder));
    return this;
  }

  public LockableModelQueryBuilder orderById() {
    this.addOrder(new OrderCriterion(QueryOrder.ASC));
    return this;
  }

  public LockableModelQueryBuilder orderById(QueryOrder queryOrder) {
    this.addOrder(new OrderCriterion(queryOrder));
    return this;
  }

  public LockableModelQueryBuilder lockVersion(Integer value) {
    addWhereConstraint(new WhereConstraint<Integer>(LockableModel._Fields.lock_version, JackMatchers.equalTo(value)));
    return this;
  }

  public LockableModelQueryBuilder whereLockVersion(IWhereOperator<Integer> operator) {
    addWhereConstraint(new WhereConstraint<Integer>(LockableModel._Fields.lock_version, operator));
    return this;
  }

  public LockableModelQueryBuilder orderByLockVersion() {
    this.addOrder(new OrderCriterion(LockableModel._Fields.lock_version, QueryOrder.ASC));
    return this;
  }

  public LockableModelQueryBuilder orderByLockVersion(QueryOrder queryOrder) {
    this.addOrder(new OrderCriterion(LockableModel._Fields.lock_version, queryOrder));
    return this;
  }

  public LockableModelQueryBuilder message(String value) {
    addWhereConstraint(new WhereConstraint<String>(LockableModel._Fields.message, JackMatchers.equalTo(value)));
    return this;
  }

  public LockableModelQueryBuilder whereMessage(IWhereOperator<String> operator) {
    addWhereConstraint(new WhereConstraint<String>(LockableModel._Fields.message, operator));
    return this;
  }

  public LockableModelQueryBuilder orderByMessage() {
    this.addOrder(new OrderCriterion(LockableModel._Fields.message, QueryOrder.ASC));
    return this;
  }

  public LockableModelQueryBuilder orderByMessage(QueryOrder queryOrder) {
    this.addOrder(new OrderCriterion(LockableModel._Fields.message, queryOrder));
    return this;
  }

  public LockableModelQueryBuilder createdAt(Long value) {
    addWhereConstraint(new WhereConstraint<Long>(LockableModel._Fields.created_at, JackMatchers.equalTo(value)));
    return this;
  }

  public LockableModelQueryBuilder whereCreatedAt(IWhereOperator<Long> operator) {
    addWhereConstraint(new WhereConstraint<Long>(LockableModel._Fields.created_at, operator));
    return this;
  }

  public LockableModelQueryBuilder orderByCreatedAt() {
    this.addOrder(new OrderCriterion(LockableModel._Fields.created_at, QueryOrder.ASC));
    return this;
  }

  public LockableModelQueryBuilder orderByCreatedAt(QueryOrder queryOrder) {
    this.addOrder(new OrderCriterion(LockableModel._Fields.created_at, queryOrder));
    return this;
  }

  public LockableModelQueryBuilder updatedAt(Long value) {
    addWhereConstraint(new WhereConstraint<Long>(LockableModel._Fields.updated_at, JackMatchers.equalTo(value)));
    return this;
  }

  public LockableModelQueryBuilder whereUpdatedAt(IWhereOperator<Long> operator) {
    addWhereConstraint(new WhereConstraint<Long>(LockableModel._Fields.updated_at, operator));
    return this;
  }

  public LockableModelQueryBuilder orderByUpdatedAt() {
    this.addOrder(new OrderCriterion(LockableModel._Fields.updated_at, QueryOrder.ASC));
    return this;
  }

  public LockableModelQueryBuilder orderByUpdatedAt(QueryOrder queryOrder) {
    this.addOrder(new OrderCriterion(LockableModel._Fields.updated_at, queryOrder));
    return this;
  }
}
