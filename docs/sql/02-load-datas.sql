\c dbssi  

\echo 'Criando os dados das categorias'

INSERT INTO public.category(
	id, title, description, url)
	VALUES (1, 'Tele Entrega', 'Fusce luctus tellus vel dui eleifend sagittis', 'tele-entrega');
	
INSERT INTO public.category(
	id, title, description, url)
	VALUES (2, 'Saúde e Beleza', 'Proin vehicula libero id est placerat', 'saude-e-beleza');
	
INSERT INTO public.category(
	id, title, description, url)
	VALUES (3, 'Manutenção e Limpeza', 'Orci varius natoque penatibus et magnis dis parturient', 'manutencao-e-limpeza'); 


\echo 'Criando os dados dos anúncios'

INSERT INTO public.ad(
	id, title, id_category, description, phone, is_whatsapp, is_promoted, is_checked)
	VALUES (1, 'Hamburgueria Ribeirão', 
            1, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean lobortis nullam.',
            '(48) 90000-0000', true,
            true, true);	
	
INSERT INTO public.ad(
	id, title, id_category, description, phone, is_whatsapp, is_promoted, is_checked)
	VALUES (2, 'Irmãos Denger', 
            3, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean lobortis nullam.',
            '(48) 3000-0000', false,
            true, true);

INSERT INTO public.ad(
	id, title, id_category, description, phone, is_whatsapp, is_promoted, is_checked)
	VALUES (3, 'Markus Fisioterapia Domiciliar', 
            2, 'Orci varius natoque penatibus et magnis dis parturient montes orci aliquam.',
            '(48) 90000-0000', true,
            true, true);

INSERT INTO public.ad(
	id, title, id_category, description, phone, is_whatsapp, is_promoted, is_checked)
	VALUES (4, 'Ca Comida Japonesa', 
            1, 'Vestibulum egestas lectus nisi, in rutrum quam imperdiet a. Sed massa nunc.',
            '(48) 90000-0000', true,
            false, true);
            
INSERT INTO public.ad(
	id, title, id_category, description, phone, is_whatsapp, is_promoted, is_checked)
	VALUES (5, 'Doces Gourmet da Paloma', 
            1, 'Nulla risus sapien, tincidunt ut lorem vitae, elementum commodo augue. Pellentesque metus.',
            '(48) 90000-0000', true,
            false, true);
            
INSERT INTO public.ad(
	id, title, id_category, description, phone, is_whatsapp, is_promoted, is_checked)
	VALUES (6, 'Soraia Marmita Fitness', 
            1, 'Donec eu diam et sem facilisis rhoncus vel at mauris. Praesent ut nunc volutpat.',
            '(48) 90000-0000', true,
            false, true);
            
INSERT INTO public.ad(
	id, title, id_category, description, phone, is_whatsapp, is_promoted, is_checked)
	VALUES (7, 'Rose Limpeza', 
            3, 'Fusce luctus tellus vel dui eleifend sagittis. Proin vehicula libero id est placerat amet.',
            '(48) 90000-0000', true,
            false, true);

INSERT INTO public.ad(
	id, title, id_category, description, phone, is_whatsapp, is_promoted, is_checked)
	VALUES (8, 'Lanches Gostosos', 
            1, 'Cras lacinia justo nec metus tincidunt, et lacinia neque egestas. Aliquam sollicitudin.',
            '(48) 90000-0000', true,
            false, false);

\echo 'Criando os dados das imagens'

INSERT INTO public.ad_images(
	ad_id , images)
	VALUES (1, '/assets/anuncios/1/img1.jpeg');

INSERT INTO public.ad_images(
	ad_id , images)
	VALUES (1, '/assets/anuncios/1/img2.jpeg');
	
INSERT INTO public.ad_images(
	ad_id , images)
	VALUES (1, '/assets/anuncios/1/img3.jpeg');
	
INSERT INTO public.ad_images(
	ad_id , images)
	VALUES (1, '/assets/anuncios/1/img4.jpeg');
	
INSERT INTO public.ad_images(
	ad_id , images)
	VALUES (2, '/assets/anuncios/2/img1.jpeg');
	
INSERT INTO public.ad_images(
	ad_id , images)
	VALUES (3, '/assets/anuncios/3/img1.jpeg');
	
INSERT INTO public.ad_images(
	ad_id , images)
	VALUES (4, '/assets/anuncios/4/img1.jpeg');

INSERT INTO public.ad_images(
	ad_id , images)
	VALUES (4, '/assets/anuncios/4/img2.jpeg');

INSERT INTO public.ad_images(
	ad_id , images)
	VALUES (5, '/assets/anuncios/5/img1.jpeg');

INSERT INTO public.ad_images(
	ad_id , images)
	VALUES (5, '/assets/anuncios/5/img2.jpeg');	

INSERT INTO public.ad_images(
	ad_id , images)
	VALUES (6, '/assets/anuncios/6/img1.jpeg');
	
INSERT INTO public.ad_images(
	ad_id , images)
	VALUES (7, '/assets/anuncios/7/img1.jpeg');

INSERT INTO public.ad_images(
	ad_id , images)
	VALUES (8, '/assets/anuncios/8/img1.jpeg');