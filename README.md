# 날씨 일기 프로젝트

이 프로젝트는 사용자가 특정 날짜에 기반하여 날씨 정보를 받아 다이어리를 작성, 조회, 수정 및 삭제할 수 있는 백엔드 시스템을 구현한 프로젝트입니다. [Open Weather Map API](https://openweathermap.org/)를 통해 날씨 데이터를 받아옵니다. 사용자는 RESTful API를 통해 날씨 일기에 접근하고 관리할 수 있습니다.

## 🚀 **기술 스택**
- **언어**: Java
- **빌드 도구**: Maven
- **데이터베이스**: MySQL
- **서버**: Tomcat
- **라이브러리**:
  - Lombok
  - Spring Web
  - Springfox Swagger UI

## 📝 **프로젝트 설명**
이 백엔드 구현은 사용자가 다음을 할 수 있게 해줍니다:
1. **다이어리 생성**: 사용자는 특정 날짜에 대한 날씨 정보를 기반으로 다이어리를 작성할 수 있습니다.
2. **다이어리 조회**: 사용자는 특정 날짜에 작성한 다이어리를 확인할 수 있습니다.
3. **다이어리 수정**: 사용자는 특정 날짜에 작성한 다이어리를 수정할 수 있습니다.
4. **다이어리 삭제**: 사용자는 특정 날짜에 작성한 다이어리를 삭제할 수 있습니다.

### 주요 기능:
- Open Weather Map API를 사용하여 사용자가 제공한 날짜에 대한 날씨 데이터를 가져옵니다.
- 사용자는 특정 날짜에 날씨 정보와 함께 다이어리 텍스트를 작성할 수 있습니다.
- 다이어리 항목은 MySQL 데이터베이스에 저장됩니다.

## 📊 **ERD (엔티티 관계도)**

![ERD](https://github.com/user-attachments/assets/79066b6d-b468-40da-9045-0cb4fbc9d989)

## 📚 **Swagger API 문서**

이 프로젝트는 Swagger API 문서를 내장하여, API의 사용 가능한 엔드포인트를 쉽게 탐색하고 테스트할 수 있습니다.

![Swagger 문서](https://github.com/user-attachments/assets/aa159c5a-867f-4e5d-aaa6-49acd3f4500b)

## 🧳 **프로젝트 목표**
- 타사 API(Open Weather Map API) 통합 방법 학습.
- Spring Boot를 사용한 간단한 CRUD 애플리케이션 구축.
- MySQL을 사용한 데이터베이스 관리 및 데이터 지속성 처리.
- Swagger를 사용한 REST API 문서화 연습.

제로베이스 수업을 통해 작성된 프로젝트입니다
