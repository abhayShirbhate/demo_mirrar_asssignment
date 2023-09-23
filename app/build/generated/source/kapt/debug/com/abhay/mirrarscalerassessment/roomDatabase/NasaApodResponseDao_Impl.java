package com.abhay.mirrarscalerassessment.roomDatabase;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NasaApodResponseDao_Impl implements NasaApodResponseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NasaApodResponseEntity> __insertionAdapterOfNasaApodResponseEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllNasaApod;

  public NasaApodResponseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNasaApodResponseEntity = new EntityInsertionAdapter<NasaApodResponseEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `nasa_apod_table` (`id`,`date`,`explanation`,`mediaType`,`serviceVersion`,`thumbnailUrl`,`title`,`url`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NasaApodResponseEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getDate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDate());
        }
        if (value.getExplanation() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getExplanation());
        }
        if (value.getMediaType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMediaType());
        }
        if (value.getServiceVersion() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getServiceVersion());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getThumbnailUrl());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTitle());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUrl());
        }
      }
    };
    this.__preparedStmtOfDeleteAllNasaApod = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM nasa_apod_table";
        return _query;
      }
    };
  }

  @Override
  public void insertNasaApodList(final List<NasaApodResponseEntity> nasaApodList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNasaApodResponseEntity.insert(nasaApodList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllNasaApod() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllNasaApod.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllNasaApod.release(_stmt);
    }
  }

  @Override
  public List<NasaApodResponseEntity> getAllNasaApod() {
    final String _sql = "SELECT * FROM nasa_apod_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfExplanation = CursorUtil.getColumnIndexOrThrow(_cursor, "explanation");
      final int _cursorIndexOfMediaType = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaType");
      final int _cursorIndexOfServiceVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceVersion");
      final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final List<NasaApodResponseEntity> _result = new ArrayList<NasaApodResponseEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final NasaApodResponseEntity _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final String _tmpExplanation;
        if (_cursor.isNull(_cursorIndexOfExplanation)) {
          _tmpExplanation = null;
        } else {
          _tmpExplanation = _cursor.getString(_cursorIndexOfExplanation);
        }
        final String _tmpMediaType;
        if (_cursor.isNull(_cursorIndexOfMediaType)) {
          _tmpMediaType = null;
        } else {
          _tmpMediaType = _cursor.getString(_cursorIndexOfMediaType);
        }
        final String _tmpServiceVersion;
        if (_cursor.isNull(_cursorIndexOfServiceVersion)) {
          _tmpServiceVersion = null;
        } else {
          _tmpServiceVersion = _cursor.getString(_cursorIndexOfServiceVersion);
        }
        final String _tmpThumbnailUrl;
        if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
          _tmpThumbnailUrl = null;
        } else {
          _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        _item = new NasaApodResponseEntity(_tmpId,_tmpDate,_tmpExplanation,_tmpMediaType,_tmpServiceVersion,_tmpThumbnailUrl,_tmpTitle,_tmpUrl);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public NasaApodResponseEntity getRandomNasaApod() {
    final String _sql = "SELECT * FROM nasa_apod_table ORDER BY RANDOM() LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfExplanation = CursorUtil.getColumnIndexOrThrow(_cursor, "explanation");
      final int _cursorIndexOfMediaType = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaType");
      final int _cursorIndexOfServiceVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceVersion");
      final int _cursorIndexOfThumbnailUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnailUrl");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final NasaApodResponseEntity _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final String _tmpExplanation;
        if (_cursor.isNull(_cursorIndexOfExplanation)) {
          _tmpExplanation = null;
        } else {
          _tmpExplanation = _cursor.getString(_cursorIndexOfExplanation);
        }
        final String _tmpMediaType;
        if (_cursor.isNull(_cursorIndexOfMediaType)) {
          _tmpMediaType = null;
        } else {
          _tmpMediaType = _cursor.getString(_cursorIndexOfMediaType);
        }
        final String _tmpServiceVersion;
        if (_cursor.isNull(_cursorIndexOfServiceVersion)) {
          _tmpServiceVersion = null;
        } else {
          _tmpServiceVersion = _cursor.getString(_cursorIndexOfServiceVersion);
        }
        final String _tmpThumbnailUrl;
        if (_cursor.isNull(_cursorIndexOfThumbnailUrl)) {
          _tmpThumbnailUrl = null;
        } else {
          _tmpThumbnailUrl = _cursor.getString(_cursorIndexOfThumbnailUrl);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        _result = new NasaApodResponseEntity(_tmpId,_tmpDate,_tmpExplanation,_tmpMediaType,_tmpServiceVersion,_tmpThumbnailUrl,_tmpTitle,_tmpUrl);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
