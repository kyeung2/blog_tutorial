package io.flyingnimbus.blog

import org.springframework.data.repository.CrudRepository

/**
 * @author Kye
 */
interface ArticleRepository : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface UserRepository : CrudRepository<User, Long> {
    fun findByLogin(login: String): User
}