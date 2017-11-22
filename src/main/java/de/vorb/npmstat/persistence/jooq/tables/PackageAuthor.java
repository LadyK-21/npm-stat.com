/*
 * Copyright 2012-2017 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/*
 * This file is generated by jOOQ.
*/
package de.vorb.npmstat.persistence.jooq.tables;


import de.vorb.npmstat.persistence.jooq.Keys;
import de.vorb.npmstat.persistence.jooq.Public;
import de.vorb.npmstat.persistence.jooq.tables.records.PackageAuthorRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PackageAuthor extends TableImpl<PackageAuthorRecord> {

    private static final long serialVersionUID = 619030516;

    /**
     * The reference instance of <code>public.package_author</code>
     */
    public static final PackageAuthor PACKAGE_AUTHOR = new PackageAuthor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PackageAuthorRecord> getRecordType() {
        return PackageAuthorRecord.class;
    }

    /**
     * The column <code>public.package_author.package_id</code>.
     */
    public final TableField<PackageAuthorRecord, Long> PACKAGE_ID = createField("package_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.package_author.author_id</code>.
     */
    public final TableField<PackageAuthorRecord, Long> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.package_author</code> table reference
     */
    public PackageAuthor() {
        this("package_author", null);
    }

    /**
     * Create an aliased <code>public.package_author</code> table reference
     */
    public PackageAuthor(String alias) {
        this(alias, PACKAGE_AUTHOR);
    }

    private PackageAuthor(String alias, Table<PackageAuthorRecord> aliased) {
        this(alias, aliased, null);
    }

    private PackageAuthor(String alias, Table<PackageAuthorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PackageAuthorRecord> getPrimaryKey() {
        return Keys.PACKAGE_AUTHOR_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PackageAuthorRecord>> getKeys() {
        return Arrays.<UniqueKey<PackageAuthorRecord>>asList(Keys.PACKAGE_AUTHOR_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PackageAuthorRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PackageAuthorRecord, ?>>asList(Keys.PACKAGE_AUTHOR__PACKAGE_AUTHOR_PACKAGE_ID_FKEY, Keys.PACKAGE_AUTHOR__PACKAGE_AUTHOR_AUTHOR_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PackageAuthor as(String alias) {
        return new PackageAuthor(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PackageAuthor rename(String name) {
        return new PackageAuthor(name, null);
    }
}
