package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_example_touchtest_AlphaDataRealmProxy extends com.example.touchtest.AlphaData
    implements RealmObjectProxy, com_example_touchtest_AlphaDataRealmProxyInterface {

    static final class AlphaDataColumnInfo extends ColumnInfo {
        long idColKey;
        long queColKey;
        long com1ColKey;
        long com2ColKey;
        long com3ColKey;
        long com4ColKey;

        AlphaDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("AlphaData");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.queColKey = addColumnDetails("que", "que", objectSchemaInfo);
            this.com1ColKey = addColumnDetails("com1", "com1", objectSchemaInfo);
            this.com2ColKey = addColumnDetails("com2", "com2", objectSchemaInfo);
            this.com3ColKey = addColumnDetails("com3", "com3", objectSchemaInfo);
            this.com4ColKey = addColumnDetails("com4", "com4", objectSchemaInfo);
        }

        AlphaDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new AlphaDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final AlphaDataColumnInfo src = (AlphaDataColumnInfo) rawSrc;
            final AlphaDataColumnInfo dst = (AlphaDataColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.queColKey = src.queColKey;
            dst.com1ColKey = src.com1ColKey;
            dst.com2ColKey = src.com2ColKey;
            dst.com3ColKey = src.com3ColKey;
            dst.com4ColKey = src.com4ColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private AlphaDataColumnInfo columnInfo;
    private ProxyState<com.example.touchtest.AlphaData> proxyState;

    com_example_touchtest_AlphaDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (AlphaDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.touchtest.AlphaData>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.idColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.idColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$que() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.queColKey);
    }

    @Override
    public void realmSet$que(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'que' to null.");
            }
            row.getTable().setString(columnInfo.queColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'que' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.queColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$com1() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.com1ColKey);
    }

    @Override
    public void realmSet$com1(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'com1' to null.");
            }
            row.getTable().setString(columnInfo.com1ColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'com1' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.com1ColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$com2() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.com2ColKey);
    }

    @Override
    public void realmSet$com2(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'com2' to null.");
            }
            row.getTable().setString(columnInfo.com2ColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'com2' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.com2ColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$com3() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.com3ColKey);
    }

    @Override
    public void realmSet$com3(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'com3' to null.");
            }
            row.getTable().setString(columnInfo.com3ColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'com3' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.com3ColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$com4() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.com4ColKey);
    }

    @Override
    public void realmSet$com4(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'com4' to null.");
            }
            row.getTable().setString(columnInfo.com4ColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'com4' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.com4ColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("AlphaData", false, 6, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("que", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("com1", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("com2", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("com3", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("com4", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AlphaDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new AlphaDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "AlphaData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "AlphaData";
    }

    @SuppressWarnings("cast")
    public static com.example.touchtest.AlphaData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.touchtest.AlphaData obj = realm.createObjectInternal(com.example.touchtest.AlphaData.class, true, excludeFields);

        final com_example_touchtest_AlphaDataRealmProxyInterface objProxy = (com_example_touchtest_AlphaDataRealmProxyInterface) obj;
        if (json.has("id")) {
            if (json.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            } else {
                objProxy.realmSet$id((int) json.getInt("id"));
            }
        }
        if (json.has("que")) {
            if (json.isNull("que")) {
                objProxy.realmSet$que(null);
            } else {
                objProxy.realmSet$que((String) json.getString("que"));
            }
        }
        if (json.has("com1")) {
            if (json.isNull("com1")) {
                objProxy.realmSet$com1(null);
            } else {
                objProxy.realmSet$com1((String) json.getString("com1"));
            }
        }
        if (json.has("com2")) {
            if (json.isNull("com2")) {
                objProxy.realmSet$com2(null);
            } else {
                objProxy.realmSet$com2((String) json.getString("com2"));
            }
        }
        if (json.has("com3")) {
            if (json.isNull("com3")) {
                objProxy.realmSet$com3(null);
            } else {
                objProxy.realmSet$com3((String) json.getString("com3"));
            }
        }
        if (json.has("com4")) {
            if (json.isNull("com4")) {
                objProxy.realmSet$com4(null);
            } else {
                objProxy.realmSet$com4((String) json.getString("com4"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.touchtest.AlphaData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.example.touchtest.AlphaData obj = new com.example.touchtest.AlphaData();
        final com_example_touchtest_AlphaDataRealmProxyInterface objProxy = (com_example_touchtest_AlphaDataRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (name.equals("que")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$que((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$que(null);
                }
            } else if (name.equals("com1")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$com1((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$com1(null);
                }
            } else if (name.equals("com2")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$com2((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$com2(null);
                }
            } else if (name.equals("com3")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$com3((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$com3(null);
                }
            } else if (name.equals("com4")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$com4((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$com4(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_example_touchtest_AlphaDataRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.example.touchtest.AlphaData.class), false, Collections.<String>emptyList());
        io.realm.com_example_touchtest_AlphaDataRealmProxy obj = new io.realm.com_example_touchtest_AlphaDataRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.example.touchtest.AlphaData copyOrUpdate(Realm realm, AlphaDataColumnInfo columnInfo, com.example.touchtest.AlphaData object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.example.touchtest.AlphaData) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.example.touchtest.AlphaData copy(Realm realm, AlphaDataColumnInfo columnInfo, com.example.touchtest.AlphaData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.touchtest.AlphaData) cachedRealmObject;
        }

        com_example_touchtest_AlphaDataRealmProxyInterface unmanagedSource = (com_example_touchtest_AlphaDataRealmProxyInterface) newObject;

        Table table = realm.getTable(com.example.touchtest.AlphaData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addString(columnInfo.queColKey, unmanagedSource.realmGet$que());
        builder.addString(columnInfo.com1ColKey, unmanagedSource.realmGet$com1());
        builder.addString(columnInfo.com2ColKey, unmanagedSource.realmGet$com2());
        builder.addString(columnInfo.com3ColKey, unmanagedSource.realmGet$com3());
        builder.addString(columnInfo.com4ColKey, unmanagedSource.realmGet$com4());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_example_touchtest_AlphaDataRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.example.touchtest.AlphaData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.touchtest.AlphaData.class);
        long tableNativePtr = table.getNativePtr();
        AlphaDataColumnInfo columnInfo = (AlphaDataColumnInfo) realm.getSchema().getColumnInfo(com.example.touchtest.AlphaData.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.idColKey, objKey, ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$id(), false);
        String realmGet$que = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$que();
        if (realmGet$que != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.queColKey, objKey, realmGet$que, false);
        }
        String realmGet$com1 = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$com1();
        if (realmGet$com1 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.com1ColKey, objKey, realmGet$com1, false);
        }
        String realmGet$com2 = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$com2();
        if (realmGet$com2 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.com2ColKey, objKey, realmGet$com2, false);
        }
        String realmGet$com3 = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$com3();
        if (realmGet$com3 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.com3ColKey, objKey, realmGet$com3, false);
        }
        String realmGet$com4 = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$com4();
        if (realmGet$com4 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.com4ColKey, objKey, realmGet$com4, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.touchtest.AlphaData.class);
        long tableNativePtr = table.getNativePtr();
        AlphaDataColumnInfo columnInfo = (AlphaDataColumnInfo) realm.getSchema().getColumnInfo(com.example.touchtest.AlphaData.class);
        com.example.touchtest.AlphaData object = null;
        while (objects.hasNext()) {
            object = (com.example.touchtest.AlphaData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.idColKey, objKey, ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$id(), false);
            String realmGet$que = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$que();
            if (realmGet$que != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.queColKey, objKey, realmGet$que, false);
            }
            String realmGet$com1 = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$com1();
            if (realmGet$com1 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.com1ColKey, objKey, realmGet$com1, false);
            }
            String realmGet$com2 = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$com2();
            if (realmGet$com2 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.com2ColKey, objKey, realmGet$com2, false);
            }
            String realmGet$com3 = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$com3();
            if (realmGet$com3 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.com3ColKey, objKey, realmGet$com3, false);
            }
            String realmGet$com4 = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$com4();
            if (realmGet$com4 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.com4ColKey, objKey, realmGet$com4, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.touchtest.AlphaData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.example.touchtest.AlphaData.class);
        long tableNativePtr = table.getNativePtr();
        AlphaDataColumnInfo columnInfo = (AlphaDataColumnInfo) realm.getSchema().getColumnInfo(com.example.touchtest.AlphaData.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.idColKey, objKey, ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$id(), false);
        String realmGet$que = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$que();
        if (realmGet$que != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.queColKey, objKey, realmGet$que, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.queColKey, objKey, false);
        }
        String realmGet$com1 = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$com1();
        if (realmGet$com1 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.com1ColKey, objKey, realmGet$com1, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.com1ColKey, objKey, false);
        }
        String realmGet$com2 = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$com2();
        if (realmGet$com2 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.com2ColKey, objKey, realmGet$com2, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.com2ColKey, objKey, false);
        }
        String realmGet$com3 = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$com3();
        if (realmGet$com3 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.com3ColKey, objKey, realmGet$com3, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.com3ColKey, objKey, false);
        }
        String realmGet$com4 = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$com4();
        if (realmGet$com4 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.com4ColKey, objKey, realmGet$com4, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.com4ColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.touchtest.AlphaData.class);
        long tableNativePtr = table.getNativePtr();
        AlphaDataColumnInfo columnInfo = (AlphaDataColumnInfo) realm.getSchema().getColumnInfo(com.example.touchtest.AlphaData.class);
        com.example.touchtest.AlphaData object = null;
        while (objects.hasNext()) {
            object = (com.example.touchtest.AlphaData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.idColKey, objKey, ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$id(), false);
            String realmGet$que = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$que();
            if (realmGet$que != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.queColKey, objKey, realmGet$que, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.queColKey, objKey, false);
            }
            String realmGet$com1 = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$com1();
            if (realmGet$com1 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.com1ColKey, objKey, realmGet$com1, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.com1ColKey, objKey, false);
            }
            String realmGet$com2 = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$com2();
            if (realmGet$com2 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.com2ColKey, objKey, realmGet$com2, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.com2ColKey, objKey, false);
            }
            String realmGet$com3 = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$com3();
            if (realmGet$com3 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.com3ColKey, objKey, realmGet$com3, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.com3ColKey, objKey, false);
            }
            String realmGet$com4 = ((com_example_touchtest_AlphaDataRealmProxyInterface) object).realmGet$com4();
            if (realmGet$com4 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.com4ColKey, objKey, realmGet$com4, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.com4ColKey, objKey, false);
            }
        }
    }

    public static com.example.touchtest.AlphaData createDetachedCopy(com.example.touchtest.AlphaData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.touchtest.AlphaData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.touchtest.AlphaData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.touchtest.AlphaData) cachedObject.object;
            }
            unmanagedObject = (com.example.touchtest.AlphaData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_touchtest_AlphaDataRealmProxyInterface unmanagedCopy = (com_example_touchtest_AlphaDataRealmProxyInterface) unmanagedObject;
        com_example_touchtest_AlphaDataRealmProxyInterface realmSource = (com_example_touchtest_AlphaDataRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$que(realmSource.realmGet$que());
        unmanagedCopy.realmSet$com1(realmSource.realmGet$com1());
        unmanagedCopy.realmSet$com2(realmSource.realmGet$com2());
        unmanagedCopy.realmSet$com3(realmSource.realmGet$com3());
        unmanagedCopy.realmSet$com4(realmSource.realmGet$com4());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("AlphaData = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{que:");
        stringBuilder.append(realmGet$que());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{com1:");
        stringBuilder.append(realmGet$com1());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{com2:");
        stringBuilder.append(realmGet$com2());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{com3:");
        stringBuilder.append(realmGet$com3());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{com4:");
        stringBuilder.append(realmGet$com4());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_example_touchtest_AlphaDataRealmProxy aAlphaData = (com_example_touchtest_AlphaDataRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aAlphaData.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAlphaData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aAlphaData.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
