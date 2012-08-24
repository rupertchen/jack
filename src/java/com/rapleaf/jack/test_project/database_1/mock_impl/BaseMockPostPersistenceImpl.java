
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project.database_1.mock_impl;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Timestamp;

import com.rapleaf.jack.AbstractMockDatabaseModel;
import com.rapleaf.jack.ModelWithId;

import com.rapleaf.jack.test_project.database_1.models.Post;
import com.rapleaf.jack.test_project.database_1.iface.IPostPersistence;

import com.rapleaf.jack.test_project.IDatabases;

public class BaseMockPostPersistenceImpl extends AbstractMockDatabaseModel<Post, IDatabases> implements IPostPersistence {
  private final IDatabases databases;

  private static AtomicInteger curId = new AtomicInteger(1);

  public BaseMockPostPersistenceImpl(IDatabases databases) {
    super(databases);
    this.databases = databases;
  }

  @Override
  public ModelWithId create(Map<Enum, Object> fieldsMap) throws IOException {
    String title = (String) fieldsMap.get(Post._Fields.title);
    Long posted_at_millis = (Long) fieldsMap.get(Post._Fields.posted_at_millis);
    Integer user_id = (Integer) fieldsMap.get(Post._Fields.user_id);
    Long updated_at = (Long) fieldsMap.get(Post._Fields.updated_at);
    return create(title, posted_at_millis, user_id, updated_at);
  }


  public Post create(final String title, final Long posted_at_millis, final Integer user_id, final Long updated_at) throws IOException {
    long __id = curId.getAndIncrement();
    Post newInst = new Post(__id, title, posted_at_millis, user_id, updated_at, databases);
    records.put(__id, newInst);
    clearForeignKeyCache();
    return newInst;
  }


  public Set<Post> find(Map<Enum, Object> fieldsMap) throws IOException {
    return super.realFind(fieldsMap);
  }

  public Set<Post> find(Set<Long> ids, Map<Enum, Object> fieldsMap) throws IOException {
    return super.realFind(ids, fieldsMap);
  }

  public Set<Post> findByTitle(final String value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Post._Fields.title, value);}});
  }

  public Set<Post> findByPostedAtMillis(final Long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Post._Fields.posted_at_millis, value);}});
  }

  public Set<Post> findByUserId(final Integer value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Post._Fields.user_id, value);}});
  }

  public Set<Post> findByUpdatedAt(final Long value) throws IOException {
    return find(new HashMap<Enum, Object>(){{put(Post._Fields.updated_at, value);}});
  }
}
