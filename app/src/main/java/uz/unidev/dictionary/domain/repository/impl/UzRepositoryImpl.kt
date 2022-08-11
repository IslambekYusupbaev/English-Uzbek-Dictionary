package uz.unidev.dictionary.domain.repository.impl

import android.database.Cursor
import uz.unidev.dictionary.data.dao.EngUzDao
import uz.unidev.dictionary.data.dao.UzEngDao
import uz.unidev.dictionary.data.entity.WordEntity
import uz.unidev.dictionary.domain.repository.UzRepository

/**
 *  Created by Nurlibay Koshkinbaev on 05/08/2022 15:27
 */

class UzRepositoryImpl(
    private val uzDao: UzEngDao
): UzRepository {

    override fun getAllWords(): Cursor {
        return uzDao.getAllWords()
    }

    override fun getSearchResult(query: String): Cursor {
        return uzDao.getSearchResult(query)
    }

    override suspend fun update(wordEntity: WordEntity) {
        uzDao.update(wordEntity)
    }

    override fun getAllBookmarks(): Cursor {
        return uzDao.getAllBookmarks()
    }

    override fun deleteAllBookmarks() {
        uzDao.deleteAllBookmarks()
    }
}