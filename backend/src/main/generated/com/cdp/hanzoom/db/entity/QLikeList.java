package com.cdp.hanzoom.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLikeList is a Querydsl query type for LikeList
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLikeList extends EntityPathBase<LikeList> {

    private static final long serialVersionUID = -1603044318L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLikeList likeList = new QLikeList("likeList");

    public final QBoard board;

    public final NumberPath<Long> likeNo = createNumber("likeNo", Long.class);

    public final QUser user;

    public QLikeList(String variable) {
        this(LikeList.class, forVariable(variable), INITS);
    }

    public QLikeList(Path<? extends LikeList> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLikeList(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLikeList(PathMetadata metadata, PathInits inits) {
        this(LikeList.class, metadata, inits);
    }

    public QLikeList(Class<? extends LikeList> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board"), inits.get("board")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

