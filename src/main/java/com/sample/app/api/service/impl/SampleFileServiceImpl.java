package com.sample.app.api.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sample.app.api.dao.SampleFileDAO;
import com.sample.app.api.service.SampleFileService;
import com.sample.app.api.vo.SampleFileVO;

import egovframework.example.sample.service.SampleVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("sampleFileService")
public class SampleFileServiceImpl extends EgovAbstractServiceImpl implements SampleFileService {

	private static final Logger LOGGER = LoggerFactory.getLogger(SampleFileServiceImpl.class);

	@Resource(name = "sampleFileDAO")
	private SampleFileDAO sampleFileDAO;

	/**
	 * 글을 등록한다.
	 * @param vo - 등록할 정보가 담긴 SampleVO
	 * @return 등록 결과
	 * @exception Exception
	 */
	@Override
	public int insertSampleFile(SampleFileVO vo) throws Exception {
		LOGGER.debug("SampleFileServiceImpl.insertSampleFile ::: " + vo.toString());
		
		sampleFileDAO.insertSampleFile(vo);
		return vo.getFileSeq();
	}

	/**
	 * 글을 수정한다.
	 * @param vo - 수정할 정보가 담긴 SampleVO
	 * @return void형
	 * @exception Exception
	 */
	@Override
	public void updateSampleFile(SampleFileVO vo) throws Exception {
		sampleFileDAO.updateSampleFile(vo);
	}

	/**
	 * 글을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 SampleVO
	 * @return void형
	 * @exception Exception
	 */
	@Override
	public void deleteSampleFile(SampleFileVO vo) throws Exception {
		sampleFileDAO.deleteSampleFile(vo);
	}

	/**
	 * 글을 조회한다.
	 * @param vo - 조회할 정보가 담긴 SampleVO
	 * @return 조회한 글
	 * @exception Exception
	 */
	@Override
	public SampleVO selectSampleFile(SampleFileVO vo) throws Exception {
		SampleVO resultVO = sampleFileDAO.selectSampleFile(vo);
		if (resultVO == null)
			throw processException("info.nodata.msg");
		return resultVO;
	}

	/**
	 * 글 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return 글 목록
	 * @exception Exception
	 */
	@Override
	public List<SampleFileVO> selectSampleFileList(SampleFileVO vo) throws Exception {
		return sampleFileDAO.selectSampleFileList(vo);
	}

	/**
	 * 글 총 갯수를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return 글 총 갯수
	 * @exception
	 */
	@Override
	public int selectSampleFileListTotCnt(SampleFileVO vo) {
		return sampleFileDAO.selectSampleFileListTotCnt(vo);
	}

}