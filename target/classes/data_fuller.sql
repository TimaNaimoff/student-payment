INSERT INTO jc_street(street_code,street_name)VALUES
(1,'Street Amir-Kulol'),
(3,'Street Oybek'),
(4,'Street Al-Kharazmi'),
(5,'Street Red');

INSERT INTO  jc_university(university_id,university_name) VALUES
(1,'SF TUIT'),
(2,'SAMMI'),
(3,'SAM-GU');
INSERT INTO jc_country_struct(area_id,area_name)VALUES
('010000000000','City'),
('010010000000','City District 1'),
('010010000001','City edge1 District 1 '),
('010020000000','City District 2'),
('010030000000','City District 3'),
('010040000000','City District 4'),

('020000000000','edge'),
('020010000000','edge area 1'),
('020010010000','edge area 1 District 1'),
('020010010001','edge area 1 District 1 village 1'),
('020010010002','edge area 1 District 1 village 2'),
('020010020000','edge area 1 District 2'),
('020010020001','edge area 1 District 2 village 1'),
('020010020002','edge area 1 District 2 village 2'),
('020010020003','edge area 1 District 2 village 3'),
('020020000000','edge area 2'),
('020020010000','edge area 2 District 1'),
('020020010001','edge area 2 District 1 village 1'),
('020020010002','edge area 2 District 1 village 2'),
('020020010003','edge area 2 District 1 village 3'),
('020020020000','edge area 2 District 2'),
('020020020001','edge area 2 District 2 village 1'),
('020020020002','edge area 2 District 2 village 2');

INSERT INTO jc_passport_office (p_office_id,p_office_area_id,p_office_name)
VALUES
(1,'010010000001','Passport office of the district 1 city'),
(2,'010010000000','Passport office of the 1 district 2 city'),
(3,'010010000000','Passport office of the 2 district 2 city'),
(4,'010010000000','Passport office of the district 3 city'),
(5,'010010000000','Passport office of the 1 area 1 village'),
(6,'010010000000','Passport office of the 1 area 2 village'),
(7,'010010000000','Passport office of the 2 area 1 district'),
(8,'010010000000','Passport office of the 2 area 2 district');

INSERT INTO jc_register_office (r_office_id,r_office_area_id,r_office_name)
VALUES
(1,'010010000000','ZAGS 1 district 1 city'),
(2,'010020000000','ZAGS 2 district 1 city'),
(3,'010010000001','ZAGS district 2 city'),
(4,'020010010001','ZAGS area 1 village 1'),
(5,'020010020002','ZAGS 1 area 1 village 2'),
(6,'020020010000','ZAGS area 2 district 1'),
(7,'020020020000','ZAG  area 2 district 2');



