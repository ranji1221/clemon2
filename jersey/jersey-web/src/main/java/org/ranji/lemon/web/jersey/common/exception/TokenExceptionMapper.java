package org.ranji.lemon.web.jersey.common.exception;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the"License"); 
 * you may not use this file except in compliance with the License.  
 * You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
 * See the License for the specific language governing permissions and limitations under the License.
 * Copyright [2017] [RanJi] [Email-jiran1221@163.com]
 * 
 * 处理token验证码错误的异常Mapper
 * @author RanJi
 * @date 2017-10-13
 * @since JDK1.7
 * @version 1.0
 */
@Provider
public class TokenExceptionMapper implements ExceptionMapper<TokenException>{
	@Override
	public Response toResponse(TokenException tokenException) {
		 return Response.ok(tokenException.tokenErrorMsg()).status(HttpServletResponse.SC_BAD_REQUEST).build();
	}

}
