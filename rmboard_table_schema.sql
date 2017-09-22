/**
 * Member Table
 */
CREATE TABLE rm_member (
	mseq			int auto_increment comment '시퀀스키', 
	mid				varchar(20) not null comment '시퀀스키', 
	mpassword		varchar(50) not null comment '시퀀스키', 
	memail			varchar(100) not null comment '시퀀스키', 
	mregdate		date not null comment '가입일',
	mdeletedate		date comment '탈퇴일',
	mdeleteyn		enum('Y','N') default 'N' comment '탈퇴여부',
	mresetyn		enum('Y','N') default 'N' comment '패스워드 리셋 여부',
	primary			key(mseq), 
	unique			key(mid),
	key				login_key(mid, mpassword)
) comment '회원 테이블'

/**
 * Board Table
 */
CREATE TABLE rm_board (
	bseq			int auto_increment comment '시퀀스키',
	mid				varchar(20) not null comment '작성자 아이디', 
	btitle			varchar(100) not null comment '제목', 
	bcontent		text not null comment '내용', 
	bregdate		date not null comment '등록일', 
	bcnt			int default 0 comment 'hit 수'				
	primary			key(bseq)	
) comment '게시판 테이블'
