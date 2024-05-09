package com.freerun.learning.controller;

import com.freerun.common.domain.dto.PageDTO;
import com.freerun.learning.domain.query.NoteAdminPageQuery;
import com.freerun.learning.domain.vo.NoteAdminDetailVO;
import com.freerun.learning.domain.vo.NoteAdminVO;
import com.freerun.learning.service.INoteService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  控制器
 * </p>

 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/notes")
public class NoteAdminController {

    private final INoteService noteService;

    @ApiOperation("管理端分页查询笔记")
    @GetMapping("/page")
    public PageDTO<NoteAdminVO> queryNotePageForAdmin(NoteAdminPageQuery query) {
        return noteService.queryNotePageForAdmin(query);
    }

    @ApiOperation("管理端查询笔记详情")
    @GetMapping("/{id}")
    public NoteAdminDetailVO queryNoteDetailForAdmin(
            @ApiParam(value = "笔记id", example = "1") @PathVariable("id") Long id) {
        return noteService.queryNoteDetailForAdmin(id);
    }

    @ApiOperation("隐藏指定笔记")
    @PutMapping("/{id}/hidden/{hidden}")
    public void hiddenNote(
            @ApiParam(value = "笔记id", example = "1") @PathVariable("id") Long id,
            @ApiParam(value = "是否隐藏", example = "false") @PathVariable("hidden") Boolean hidden) {
        noteService.hiddenNote(id, hidden);
    }
}
