package com.bitcamp.web.common.util;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class PageProxy {
    @Autowired Printer p;
    private int pageNum, pageSize, blockSize, startRow,
                endRow, startPage, endPage, prevBlock, nextBlock, totalCount;
                
    private String search;
    private boolean existPrev, existNext;

    public void execute(Map<?,?> paramMap){
        
        //  Dim-1 Row scalar count
        int totalCount = Integer.parseInt(String.valueOf(paramMap.get("totalCount")));
        //  Dim-2 Page scalar info
        String _pageNum = (String)paramMap.get("page_num");
        pageNum = (_pageNum == null) ? 1 : Integer.parseInt(_pageNum);
        String _pageSize = (String)paramMap.get("page_size");
        pageSize = (_pageSize == null) ? 5 : Integer.parseInt(_pageSize);
        int nmg = totalCount % pageSize;
        int pageCount = (nmg == 0)? totalCount / pageSize : totalCount / pageSize + 1;
        startRow = (pageNum - 1) * pageSize;
        endRow = (totalCount > pageNum * pageSize) ? pageNum * pageSize : totalCount;
        //  Dim-3 Block scalar info
        String _blockSize = (String)paramMap.get("block_size");
        blockSize = (_blockSize == null) ? 5 : Integer.parseInt(_blockSize);
        int blockNum = (pageNum -1) / blockSize;
        
        existPrev = (startPage - pageSize) > 0;
        existNext = (startPage + pageSize) <= pageCount;
        
        startPage = (existPrev) ? blockNum * blockSize + 1 : 1;
        endPage = (endPage > pageCount) ? pageCount : startPage + (blockSize -1);

        prevBlock = startPage - pageSize;
        nextBlock = startPage + pageSize;
        search = (String)paramMap.get("search");


        

        

        

        // startRow

        // endRow
        
       
    }

}