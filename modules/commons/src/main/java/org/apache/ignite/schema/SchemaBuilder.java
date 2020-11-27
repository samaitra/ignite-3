package org.apache.ignite.schema;

public interface SchemaBuilder {
    SchemaBuilder withName(String tableName);

    SchemaColumnCollectionBuilder<? extends SchemaKeyColumnBuilder> keyColumns();

    SchemaColumnCollectionBuilder<? extends SchemaValueColumnBuilder> valueColumns();

    SchemaIndexBuilder addIndex(String name);

    SchemaBuilder addAlias(String alias, String columnName);

    void build();
}