package com.freerun.learning.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freerun.common.domain.dto.PageDTO;
import com.freerun.learning.domain.dto.NoteFormDTO;
import com.freerun.learning.domain.po.Note;
import com.freerun.learning.domain.query.NoteAdminPageQuery;
import com.freerun.learning.domain.query.NotePageQuery;
import com.freerun.learning.domain.vo.NoteAdminDetailVO;
import com.freerun.learning.domain.vo.NoteAdminVO;
import com.freerun.learning.domain.vo.NoteVO;

/**
 * <p>
 *  服务类
 * </p>

 */
public interface INoteService extends IService<Note> {

    void saveNote(NoteFormDTO noteDTO);

    void gatherNote(Long id);

    void removeGatherNote(Long id);

    void updateNote(NoteFormDTO noteDTO);

    PageDTO<NoteVO> queryNotePage(NotePageQuery query);

    PageDTO<NoteAdminVO> queryNotePageForAdmin(NoteAdminPageQuery query);

    NoteAdminDetailVO queryNoteDetailForAdmin(Long id);

    void hiddenNote(Long id, boolean hidden);

    void removeMyNote(Long id);
}
