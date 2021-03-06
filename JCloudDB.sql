USE [MyCloud]
GO
/****** Object:  Table [dbo].[userInfo]    Script Date: 11/27/2017 13:22:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[userInfo](
	[uNo] [nchar](5) NOT NULL,
	[uName] [nchar](10) NULL,
	[uPwd] [nchar](32) NULL,
 CONSTRAINT [PK_userInfo] PRIMARY KEY CLUSTERED 
(
	[uNo] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[shareFile]    Script Date: 11/27/2017 13:22:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[shareFile](
	[fNo] [nchar](16) NULL,
	[fPwd] [nchar](4) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[fileInfo]    Script Date: 11/27/2017 13:22:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[fileInfo](
	[fNo] [nchar](16) NOT NULL,
	[uNo] [nchar](5) NULL,
	[fName] [nchar](30) NULL,
	[fHash] [nchar](32) NULL,
	[fPath] [nchar](50) NULL,
	[fDate] [nchar](30) NULL,
 CONSTRAINT [PK_fileInfo] PRIMARY KEY CLUSTERED 
(
	[fNo] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[adminInfo]    Script Date: 11/27/2017 13:22:19 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[adminInfo](
	[aNo] [nchar](5) NOT NULL,
	[aName] [nchar](10) NULL,
	[aPwd] [nchar](32) NULL,
 CONSTRAINT [PK_adminInfo] PRIMARY KEY CLUSTERED 
(
	[aNo] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
